import java.sql.Time;

public class k5_polymorphism {

    // POLYMORPHISM: Polymorphism means "many forms", and it occurs when we have
    // many classes that are related to each other by inheritance. Inheritance lets
    // us inherit attributes and methods from another class. Polymorphism uses those
    // methods to perform different tasks. This allows us to perform a single action
    // in different ways

    
    // Compile-Time Polymorphism (Static Polymorphism):
    // This type of polymorphism is resolved during compile time.
    // It is achieved through method overloading.
    // Method overloading allows a class to have multiple methods(function) with the same name
    // but different parameters.
    // The compiler determines which method to call based on the method signature
    // (name and parameters).
    
    // Run-Time Polymorphism (Dynamic Polymorphism):
    // This type of polymorphism is resolved during runtime.
    // It is achieved through method overriding.
    // Method overriding occurs when parent and child classes both contain the same function with a different definition
    // The decision of which method to call is made at runtime based on the actual
    // object type.(mtlb jiska object create karege wahi class ka function call hoga)

    // 2.runtime polymorhism(dynamic)
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.2, (float) 2.8));
        System.out.println(calc.sum(1, 2, 3));

        Animal a1 = new Animal();
        a1.eat(); 
        Deer d = new Deer();
        d.eat();
    }
}

// COMPILE TIME POLYMORPHISM(METHOD OVERLOADING)
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// RUN TIME POLYMORPHISM(method overriding)
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
