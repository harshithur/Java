class Car {
    String ownerName;
    int id;
    double registrationNumber;

    void carDetails() {
        System.out.println(ownerName);
        System.out.println(id);
        System.out.println(registrationNumber);
    }
}

class Bike {
    String ownerName;
    int id;
    double registrationNumber;

    void bikeDetails() {
        System.out.println(ownerName);
        System.out.println(id);
        System.out.println(registrationNumber);
    }
}

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        car.ownerName = "Ramesh";
        car.registrationNumber = 1432;
        car.id = 1167;
        car.carDetails();

        Bike bike = new Bike();
        bike.ownerName = "Suresh";
        bike.id = 1897;
        bike.registrationNumber = 85387;
        bike.bikeDetails();
    }
}
