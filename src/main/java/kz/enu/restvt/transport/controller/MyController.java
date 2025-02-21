package kz.enu.restvt.transport.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.enu.restvt.transport.entities.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class MyController {
    @Autowired
    ObjectMapper objectMapper;


    @GetMapping("/transport")
    public String transport() {
        return "transport";
    }

     @GetMapping("/Busdatas")
    public String Busservice() {
        String jsonText=null;
         Bus bus1 =new Bus(1,"46",10,"7","Bauyrzhan","ENU","ACTIVE","8:30");
         try {
             jsonText=objectMapper.writeValueAsString(bus1);
         }catch (JsonProcessingException e) {
             System.out.println("Something went wrong" +e.getMessage()  );
         }
         return jsonText;
     }

     @PostMapping("/specificBus")
    public String Busservice2(@RequestParam int id,
                              @RequestParam String number,
                              @RequestParam int capacity,
                              @RequestParam String routeNumber,
                              @RequestParam String driverName,
                              @RequestParam String currentLocation,
                              @RequestParam String status,
                              @RequestParam String departureTime
                              ) {
        String jsonText=null;
         Bus bus1 =new Bus(id,number,capacity,routeNumber,driverName,currentLocation,status,departureTime);
         try {
             jsonText=objectMapper.writeValueAsString(bus1);
         }catch (JsonProcessingException e) {
             System.out.println("Something went wrong" +e.getMessage()  );
         }
        return jsonText;
     }
    @PostMapping("/specificBus2")
    public String Busservice3(@RequestBody Bus bus1) {
        String jsonText=null;
        try {
            jsonText=objectMapper.writeValueAsString(bus1);
        }catch (JsonProcessingException e) {
            System.out.println("Something went wrong" +e.getMessage()  );
        }
        return jsonText;
    }
    @PostMapping("/specificBus3/{id}")
    public String Busservice4(@PathVariable int id) {
        String jsonText=null;
        Bus bus1 =new Bus(id,"46",10,"7","Bauyrzhan","ENU","ACTIVE","8:30");

        try {
            jsonText=objectMapper.writeValueAsString(bus1);
        }catch (JsonProcessingException e) {
            System.out.println("Something went wrong" +e.getMessage()  );
        }
        return jsonText;
    }
}

