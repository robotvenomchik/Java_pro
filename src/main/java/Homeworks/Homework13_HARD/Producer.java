package Homeworks.Homework13_HARD;

import java.util.concurrent.Exchanger;


public class Producer implements Runnable {

    private final int[] numbers;
    private final Exchanger<Integer> exchanger;
    private static final int STOP_SIGNAL = Integer.MIN_VALUE;

    public Producer(int[] numbers, Exchanger<Integer> exchanger) {
        this.numbers = numbers;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            for (int num : numbers) {
                exchanger.exchange(num);
            }
            exchanger.exchange(STOP_SIGNAL);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

