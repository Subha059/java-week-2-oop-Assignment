class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a bike");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();

        v1.display();
        v2.display();
        v3.display();
    }
}