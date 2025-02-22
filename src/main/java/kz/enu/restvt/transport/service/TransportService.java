package kz.enu.restvt.transport.service;

import kz.enu.restvt.transport.entities.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransportService {

    private final List<Bus> busList = new ArrayList<>();

    public TransportService() {
        busList.add(new Bus(1, "46", 10, "7", "Bauyrzhan", "ENU", "ACTIVE", "8:30"));
        busList.add(new Bus(2, "23", 15, "5", "Arman", "Station", "IN_SERVICE", "9:00"));
    }

    public List<Bus> getAllBuses() {
        return busList;
    }

    public Bus getBusById(int id) {
        return busList.stream()
                .filter(bus -> bus.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Bus addBus(Bus bus) {
        busList.add(bus);
        return bus;
    }
}
