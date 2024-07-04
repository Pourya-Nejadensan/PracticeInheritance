public class Main {
    public static void main(String[] args) {
        Vehicle bmwVehicle = new Vehicle("BMW", "i5", 2020);
        Vehicle mercedesVehicle = new Vehicle("mercedes", "cla", 2022);
        Vehicle porscheVehicle = new Vehicle("porsche", "Cayman", 2021);

        System.out.println(bmwVehicle);
        System.out.println(mercedesVehicle);
        System.out.println(porscheVehicle);

        Car pouryaCar = new Car(porscheVehicle,2);
        System.out.println(pouryaCar);
        System.out.println(pouryaCar.showInfo());

        Car marcelCar = new Car(bmwVehicle,4);
        System.out.println(marcelCar);
        System.out.println(marcelCar.showInfo());

        Car evaCar = new Car(mercedesVehicle,4);
        System.out.println(evaCar);
        System.out.println(evaCar.showInfo());
    }
}
