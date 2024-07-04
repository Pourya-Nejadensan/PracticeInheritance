public class Vehicle {
    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    public String showInfo(){
        return "Manufacturer: " + manufacturer + " | Model: " + model + " | Year of manufacture: " + yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
