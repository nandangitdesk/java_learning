package OOPSQUESTIONS;

public class Question6 {
    public static void main(String[] args) {
         Test t = new Test();
        t.set_marks(100);      // Line 2
        System.out.println(Test.marks);  // Line 3
    }
}

class Test {
    static int marks;
    void set_marks(int marks) {
        this.marks = marks; // Line 1
    }
}

//which line has error ?
//a) Line 1
//b) Line 2
//c) Line 3
//d) none all good ✅