package com.company.race;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static com.company.race.Race.startRace;
import static com.company.race.Race.startRaceTime;

public class Main {
    public static void main(String[] args) {
        List<RaceCarRunnable> carsList = new ArrayList<>();
        List<Thread> threadsList = new ArrayList<>();
        int raceDistance = 1000; // Длина трассы

        CountDownLatch latch = new CountDownLatch(carsList.size());

        // Создайте несколько гоночных машин
        RaceCarRunnable car1 = new RaceCarRunnable("Car1", 200, raceDistance, latch);
        RaceCarRunnable car2 = new RaceCarRunnable("Car2", 220, raceDistance, latch);

        carsList.add(car1);
        carsList.add(car2);

        // Создайте потоки для гонщиков
        for (RaceCarRunnable car : carsList) {
            Thread carThread = new Thread(car);
            threadsList.add(carThread);
        }

        startRace(threadsList);

        try {
            latch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long smallestFinishTime = Long.MAX_VALUE;
        RaceCarRunnable winner = null;

        for (RaceCarRunnable car : carsList) {
            long finishTime = car.getFinishTime();
            System.out.println(car.name + " FINISHED ! Time: " + convertToTime(finishTime));
            if (finishTime < smallestFinishTime) {
                smallestFinishTime = finishTime;
                winner = car;
            }
        }

        System.out.println("The winner is " + winner.name);
    }

    private static String convertToTime(long time) {
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");
        return sdf.format(time - startRaceTime.get());
    }
}
