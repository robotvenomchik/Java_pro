package Homeworks.Homework24;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("This is the first log message");
        logger.log("Another log message for today");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.log("This is a log message after some time");

        Logger logger1 = Logger.getInstance();
        logger1.log("Test logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Test logger2");
        logger.close();

        System.out.println("Are logger1 and logger2 same? " + (logger1 == logger2));
    }
}
