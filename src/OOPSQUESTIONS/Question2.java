package OOPSQUESTIONS;

public class Question2 {
    public static void main(String[] args) {

    }
}

class Person{
    String name;
    int weight;
}

class myStudent extends Person{
    int rollNo;
    String schoolName;
}

//Which variable can the class Person access in the following code
//a) name ✅
//b) weight ✅
//c) schoolName
//d) rollNo

//Question3 - which of the following modifiers are not allowed in front of the class.

//a) private ✅
//b) protected ✅
//c) public
//d) default


//Question4 - which of the following is correct statement ? ( both classes in same packages )

// class Vehicle{}
// class Car extends Vehicle{}

//a) Vehicle v = new Car(); ✅
//b) Car c = new Vehicle(); ✅
//c) Vehicle v = new Car(); ✅
    // ^             ^
    // |             |
// parent reference = child object

//d) Car c = new Vehicle(); ❌


