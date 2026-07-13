class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        super(); // Calls the Vehicle constructor
        System.out.println("This is a FourWheeler Vehicle");
    }
}
class Car extends FourWheeler {
    Car() {
        super(); // calls the FourWheeler constructor
        System.out.println("This 4 Wheeler Vehicle is a Aston Martin DB5");
    }
}
public class VehicleMultilevel {
    public static void main(String[] args) {
        Car obj = new Car(); // Triggers all the constructors in the order 
    }
}
