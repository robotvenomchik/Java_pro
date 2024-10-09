package Homeworks.Homework13_HARD;

import java.util.concurrent.Exchanger;
public class Consumer implements Runnable {

    private final DataHandler dataHandler;
    private final Exchanger<Integer> exchanger;
    private static final int STOP_SIGNAL = Integer.MIN_VALUE;

    public Consumer(DataHandler dataHandler, Exchanger<Integer> exchanger) {
        this.dataHandler = dataHandler;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            int num;
            while ((num = exchanger.exchange(null)) != STOP_SIGNAL) {
                System.out.println("Initial value is " + num);
                int newNum = dataHandler.modify(num);
                System.out.println("New value is " + newNum);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
