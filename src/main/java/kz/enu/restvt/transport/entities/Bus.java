package kz.enu.restvt.transport.entities;

public class Bus {

    public Bus(){

    }

    public Bus(int id, String number, int capacity, String routeNumber, String driverName, String currentLocation, String status, String departureTime) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
        this.routeNumber = routeNumber;
        this.driverName = driverName;
        this.currentLocation = currentLocation;
        this.status = status;
        this.departureTime = departureTime;
    }

    private int id;

    private String number;

    private int capacity;

    private String routeNumber;

    private String driverName;

    private String currentLocation;

    private String status;

    private String departureTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Bus:" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", capacity=" + capacity +
                ", routeNumber='" + routeNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", status='" + status + '\'' +
                ", departureTime='" + departureTime;
    }
}
