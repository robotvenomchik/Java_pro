package Homeworks.Homework25;

public class Car implements Transport {
    private String color;
    private int speed;

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Car is driving at " + speed + " km/h with color " + color + ".");
    }

    @Override
    public void refill() {
        System.out.println("Car is reffiling....");

    }
}
