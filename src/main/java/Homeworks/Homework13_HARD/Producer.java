package Homeworks.Homework13_HARD;

import java.util.concurrent.Exchanger;

public class Producer implements Runnable {

    private final int[] numbers;
    private final Exchanger<Integer> exchanger;

    public Producer(int[] numbers, Exchanger<Integer> exchanger) {
        this.numbers = numbers;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            for (int num : numbers) {
                System.out.println("Initial value is " + num);
                exchanger.exchange(num);
            }
            exchanger.exchange(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

