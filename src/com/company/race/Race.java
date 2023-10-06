package com.company.race;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

class Race {
    public static AtomicLong startRaceTime = new AtomicLong();

    public static void startRace(List<Thread> cars) {
        CountDownLatch startLatch = new CountDownLatch(1);

        Thread countdownThread = new Thread(() -> {
            try {
                for (int i = 3; i > 0; i--) {
                    System.out.println(i + "...");
                    Thread.sleep(500);
                }
                System.out.println("GO!!!");
                startRaceTime.set(System.currentTimeMillis());
                startLatch.countDown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        countdownThread.start();

        try {
            startLatch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (Thread carThread : cars) {
            carThread.start();
        }
    }
}