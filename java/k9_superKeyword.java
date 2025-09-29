public class k9_superKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animal{
   String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        // super();  agr hum ye na bhi use kare toh java by default apne ap  super keyword ka use krta hai or program execute krata hai
        System.out.println("horse constructor is called");
    }
}