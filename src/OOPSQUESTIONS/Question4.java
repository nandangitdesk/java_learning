package OOPSQUESTIONS;

public class Question4 {
    public static void main(String[] args) {
        NewVehicle obj = new Bike();
//        obj.print1();  // error

        NewVehicle obj1 = new NewVehicle();
        obj1.print();
    }
}

class NewVehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Bike extends NewVehicle {
    void print1() {
        System.out.println("Derived class (Bike)");
    }

}
