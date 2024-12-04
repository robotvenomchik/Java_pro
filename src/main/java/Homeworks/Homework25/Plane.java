package Homeworks.Homework25;

public class Plane implements Transport {
    private int altitude;

    public Plane(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public void move() {
        System.out.println("Plane is flying at altitude " + altitude + " meters.");
    }

    @Override
    public void refill() {
        System.out.println("Plane is reffiling....");

    }
}
