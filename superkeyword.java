// Java super Keyword
// In Java, the super keyword is used to refer to the parent class of a subclass.

// The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

// It can be used in two main ways:

// To access attributes and methods from the parent class
// To call the parent class constructor
class Man{
    int data = 40; // default variable
    Man(){
        System.out.println("Walking");
    }
}
class Nan extends Man{
    Nan(){
        super();
        System.out.println("Running");
    }
    public void display(){
        System.out.println("Data: " + super.data);
    }
}
public class Super {
    public static void main(String[] args) {
        Nan obj = new Nan();
        obj.display(); // Accessing default variable within the same package
    }
}
