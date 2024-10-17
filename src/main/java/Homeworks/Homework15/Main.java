package Homeworks.Homework15;

public class Main {

    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        // Створюємо потоки
        Thread allNamesThread = new Thread(() -> uiOperator.getOutput(handler.getAll()));
        Thread getByIdThread = new Thread(() -> {
            uiOperator.getOutput(handler.getById(172));
            uiOperator.getOutput(handler.getById(387));
            uiOperator.getOutput(handler.getById(122));
        });

        // Запускаємо потоки
        allNamesThread.start();
        getByIdThread.start();

        try {
            // Очікуємо завершення роботи потоків
            allNamesThread.join();
            getByIdThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
