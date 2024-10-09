package Homeworks.Homework13_HARD;


import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new DataRepository().getData();
        DataHandler dataHandler = new DataHandler();
        Exchanger<Integer> exchanger = new Exchanger<>();

        // Створюємо два потоки для обробки даних
        Thread producer = new Thread(new Producer(numbers, exchanger));
        Thread consumer = new Thread(new Consumer(dataHandler, exchanger));

        // Запускаємо потоки
        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
