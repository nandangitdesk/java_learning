package OOPSQUESTIONS;

public class Question5 {
    public static void main(String[] args) {

        System.out.println(Book.count);

        Book b1 = new Book(100);
        Book b2 = new Book(200);

        System.out.println(Book.count);
    }
}

class Book{
    int price;
    static int count;
    public Book(int price){
        this.price=price;
        count++;
    }
}

//what will be output
//a) Error
//b) 0 2
//c) 1 2 ✅
//d) 2 2