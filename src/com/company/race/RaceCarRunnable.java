package com.company.race;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

class RaceCarRunnable extends Car implements Runnable {
    private int passed;
    private int distance;
    private boolean isFinish;
    private long finishTime;
    private CountDownLatch latch;

    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }

    private int getRandomSpeed() {
        Random rand = new Random();
        int minSpeed = maxSpeed / 2;
        int speedRange = maxSpeed - minSpeed + 1;
        return minSpeed + rand.nextInt(speedRange);
    }
    public long getFinishTime() {
        return finishTime;
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            int speed = getRandomSpeed();
            passed += speed;
            System.out.println(name + " => speed: " + speed + "; progress: " + passed + "/" + distance);
            if (passed >= distance) {
                isFinish = true;
                finishTime = System.currentTimeMillis();
                latch.countDown();
            }
        }
    }
}