package educative.basics;

class VehicleA1 {

    private int id;
    private String model;

    public VehicleA1(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

}

class Driver {

    String driverName;
    VehicleA1 vehicle;

    public Driver(String driverName, VehicleA1 vehicle) {
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

    public String getDriverName() {
        return driverName;
    }

    public VehicleA1 getVehicle() {
        return vehicle;
    }

}

public class AggregationCompositionChallenge {

    public static void main(String[] args) {
        VehicleA1 vehicle = new VehicleA1(4453, "Volvo S60");
        Driver driver = new Driver("John", vehicle);
        System.out.println(driver.getDriverName() +
                " " + driver.getVehicle().getId() +
                " " + driver.getVehicle().getModel());
    }

}
