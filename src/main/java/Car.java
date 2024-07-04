public class Car extends Vehicle{
    private int numberOfDoors;

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
