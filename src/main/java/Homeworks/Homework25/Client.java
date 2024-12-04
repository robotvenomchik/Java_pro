package Homeworks.Homework25;

public class Client {
    public void run() {
        TransportFactory carFactory = new CarFactory("Red", 120);
        TransportFactory planeFactory = new PlaneFactory(10000);

        SingletonCarFactory singletonCarFactory = SingletonCarFactory.getInstance("Blue", 100);

        TransportManager manager = new TransportManager();
        manager.addTransport(carFactory.createTransport());
        manager.addTransport(planeFactory.createTransport());
        manager.addTransport(singletonCarFactory.createTransport());

        manager.moveAll();
    }

    public static void main(String[] args) {
        Client client= new Client();
        client.run();
    }
}
