package OOPSQUESTIONS;


//Question5 - what will be the output of the following code ?
public class Question3 {
    public static void main(String[] args) {
          Vehicle v = new Car();
          v.print();  // func overriding - this will print "Derived class (Car)"

          Vehicle v1 = new Vehicle();
          v1.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived class (Car)");
    }
}
