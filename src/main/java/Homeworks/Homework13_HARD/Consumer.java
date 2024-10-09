package Homeworks.Homework13_HARD;

import java.util.concurrent.Exchanger;

public class Consumer implements Runnable {

    private final DataHandler dataHandler;
    private final Exchanger<Integer> exchanger;

    public Consumer(DataHandler dataHandler, Exchanger<Integer> exchanger) {
        this.dataHandler = dataHandler;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            int num;
            while ((num = exchanger.exchange(null)) != 0) {
                int newNum = dataHandler.modify(num);
                System.out.println("New value is " + newNum);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
