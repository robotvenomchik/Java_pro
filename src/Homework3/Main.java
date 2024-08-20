package Homework3;

public class Main {
    Converter converter= new Converter();
    public static void main(String[] args) {
        System.out.println("Convertor");

        System.out.println(Converter.celsiusToFahrenheit(342));
        System.out.println(Converter.fahrenheitToCelsius(647.6));
    }
}
