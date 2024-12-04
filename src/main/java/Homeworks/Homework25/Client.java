package Homeworks.Homework25;

public class Client {
    void run(){
        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();
        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();
        car.move();
        plane.move();
    };

    public static void main(String[] args) {
        Client client= new Client();
        client.run();
    }
}
