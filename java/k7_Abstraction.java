
public class k7_Abstraction {

    // Data abstraction is the process of hiding certain details and showing only
    // essential information to the user.
    // Abstraction can be achieved with either abstract classes or interfaces

    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        
        Mustang myHorse = new Mustang();

        // Animal A1 = new Animal(); ye error show krega kyuki abstract class ka hum
        // object create nhi kr skte
    }
}



// ABSTRACT CLASS
abstract class Animal { // abstract class bnane ke liye class se phele abstract likhna hota hai
    String color;

    // create animal constructor
    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();    // yaha abstract likhne se ab ye walk wali property sabhi child m dena hoga nhi toh error aayga
}

class Horse extends Animal {

    // create horse constructor
    Horse() {
        System.out.println("horse constructor called");
    }

    // create method
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}


class Mustang extends Horse {
    Mustang() {
        System.out.println("constructor called");
    }
}
