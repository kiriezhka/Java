package com.company.homework9;

import java.util.UUID;

public class GameConsole implements Powered {
    private final Brand brand;
    private final String model;
    private final UUID serial;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;
    private int waitingCounter;
    public class Gamepad {
        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        private final Brand brand;
        private final UUID consoleSerial;
        private final int connectedNumber;
        private Color color;
        private double chargeLevel;
        private boolean isOn;

        public enum Color { RED, BLUE, GREEN }

        public Gamepad(Brand brand, UUID consoleSerial, int connectedNumber) {
            this.brand = brand;
            this.consoleSerial = consoleSerial;
            this.connectedNumber = connectedNumber;
            this.color = Color.RED;
            this.chargeLevel = 100.0;
            this.isOn = false;
        }

        // Геттеры и сеттеры для полей
        // ...

        public boolean isOn() {
            return isOn;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }
    }
    public enum Brand { SONY, MICROSOFT }

    public GameConsole(Brand brand, UUID serial) {
        this.brand = brand;
        this.model = "Unknown";
        this.serial = serial;
        this.firstGamepad = new Gamepad(brand, serial, 1);
        this.secondGamepad = new Gamepad(brand, serial, 2);
        this.isOn = false;
        this.activeGame = null;
        this.waitingCounter = 0;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public UUID getSerial() {
        return serial;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void loadGame(Game game) {
        this.activeGame = game;
        System.out.println("Игра " + game.getName() + " загружается");
    }

    public void playGame() {
        checkStatus();
        if (activeGame != null) {
            System.out.println("Играем в " + activeGame.getName());
            System.out.println("Заряд первого джойстика: " + firstGamepad.getChargeLevel() + "%");
            System.out.println("Заряд второго джойстика: " + secondGamepad.getChargeLevel() + "%");

            firstGamepad.setChargeLevel(firstGamepad.getChargeLevel() - 10);
            secondGamepad.setChargeLevel(secondGamepad.getChargeLevel() - 10);

            if (firstGamepad.getChargeLevel() <= 0) {
                firstGamepad.turnOff();
            }

            if (secondGamepad.getChargeLevel() <= 0) {
                secondGamepad.turnOff();
            }
        }
    }

    private void checkStatus() {
        if (!firstGamepad.isOn() && !secondGamepad.isOn()) {
            waitingCounter++;
            if (waitingCounter >= 5) {
                turnOff();
                throw new ConsoleInactiveException("Приставка завершает работу из-за отсутствия активности");
            }
        } else {
            waitingCounter = 0;
        }
    }

    @Override
    public void powerOn() {
        turnOn();
    }

    @Override
    public void powerOff() {
        turnOff();
    }
}

interface Powered {
    void powerOn();

    void powerOff();
}

class ConsoleInactiveException extends RuntimeException {
    public ConsoleInactiveException(String message) {
        super(message);
    }
}

