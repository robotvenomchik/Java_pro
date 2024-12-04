package Homeworks.Homework25;

public class PlaneFactory extends TransportFactory {
    private int altitude;

    public PlaneFactory(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public Transport createTransport() {
        return new Plane(altitude);
    }
}
