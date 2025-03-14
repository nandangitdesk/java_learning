package OOPSQUESTIONS;

public class Question1 {
    public static void main(String[] args) {
         Student s1 = new Student();
    }
}

class Student{
    int rollNo;
    String name;
    int age;
}

//question - Find out the correct statement to assign name to objects of class Student

//a) s1->name = "Rohit";
//b) s1.name = "Rohit"; ✅
//c) Student.name = "Rohit";
//d) Student s1->name = "Rohit";