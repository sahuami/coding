public class k3_multiLevelinheritance {
    public static void main(String[] args) {
        
        dog dobby = new dog();
        dobby.eat();
        dobby.breathe();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.breed = "bulldog";
        System.out.println(dobby.breed);

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
    int legs;
}

class dog extends Mammals{
    String breed;
}