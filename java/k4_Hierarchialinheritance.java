public class k4_Hierarchialinheritance {
    
    public static void main(String[] args) {
        Mammals tommy = new Mammals();
        tommy.eat();
        tommy.breathe();

        Fish whale = new Fish();
        whale.swim();
        whale.eat();
        whale.color= "blue";
        System.out.println( whale.color);
        
        Bird pigeon = new Bird();
        pigeon.eat();
        pigeon.fly();
        pigeon.color = "white";
        System.out.println(pigeon.color);
    }
}

class Animal{
      String color;
      void eat()
      {
        System.out.println("eats");
      }

      void breathe()
      {
        System.out.println("breathe");
      }
}

class Mammals extends Animal{
    void walk()
    {
        System.out.println("walks");
    }
}

class Fish extends Animal{
 void swim()
 {
    System.out.println("swin");
 }
}


class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


//  or bhi types hote hai inheritance ke ek hybrid inheritance  or dusra multiple inheritance(isko java  m classes he help se nhi krta skte c++ me isko classes ki help se kr skte hai  java me hum isko interface ki help se kr skte hai) 