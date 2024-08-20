package Homework2;

public class Main {

    public static void main(String[] args) {
        // Створення об'єктів конвертерів
        KilometerToMileConverter kilometerToMileConverter = new KilometerToMileConverter();
        MileToKilometerConverter mileToKilometerConverter = new MileToKilometerConverter();

        // Приклад використання методів конвертації
        double kilometers = 10.0;
        double miles = kilometerToMileConverter.convertKilometersToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        miles = 5.0;
        kilometers = mileToKilometerConverter.convertMilesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
