public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(Vehicle vehicle, int numberOfDoors) {
        super(vehicle.getManufacturer(), vehicle.getModel(), vehicle.getYearOfManufacture());
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "\nCar Number : " + numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}
