package kz.enu.restvt.transport.controller;

import kz.enu.restvt.transport.entities.Bus;
import kz.enu.restvt.transport.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transport")
public class MyController {

    private final TransportService transportService;

    @Autowired
    public MyController(TransportService transportService) {
        this.transportService = transportService;
    }

    // Получить все автобусы
    @GetMapping("/buses")
    public List<Bus> getAllBuses() {
        return transportService.getAllBuses();
    }

    // Получить автобус по ID
    @GetMapping("/buses/{id}")
    public Bus getBusById(@PathVariable int id) {
        return transportService.getBusById(id);
    }

    // Добавить автобус через JSON в теле запроса
    @PostMapping("/buses")
    public Bus addBus(@RequestBody Bus bus) {
        return transportService.addBus(bus);
    }
}
