package Homeworks.Homework25;

import java.util.ArrayList;
import java.util.List;

class TransportManager {
    private List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public void moveAll() {
        for (Transport transport : transports) {
            transport.move();
        }
    }
    public void refillAll() {
        for (Transport transport : transports) {
            transport.refill();
        }
    }
}

