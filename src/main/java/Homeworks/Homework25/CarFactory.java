package Homeworks.Homework25;

public class CarFactory extends TransportFactory {
    private String color;
    private int speed;

    public CarFactory(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public Transport createTransport() {
        return new Car(color, speed);
    }
}
