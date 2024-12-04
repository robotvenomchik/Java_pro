package Homeworks.Homework25;

public class SingletonCarFactory extends TransportFactory {
    private static SingletonCarFactory instance;
    private String color;
    private int speed;

    private SingletonCarFactory(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public static SingletonCarFactory getInstance(String color, int speed) {
        if (instance == null) {
            instance = new SingletonCarFactory(color, speed);
        }
        return instance;
    }

    @Override
    public Transport createTransport() {
        return new Car(color, speed);
    }
}

