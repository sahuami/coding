public class k8_Abstraction {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        // Bear b = new Bear();
        // b.eat();
        // b.fight();
    }                
}    
    

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down, left, right,diagonal ");
    }
}

class rook implements ChessPlayer {
    public void moves() {
        System.out.println("forward, backward or sideways ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down, left, right,diagonal (in 1 steps)");
    }
}




// multiple inheritance
interface Herbivore {
    void eat();
}

interface Carnivore {
    void fight();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("bear eat grass");
    }

    public void fight() {
        System.out.println("bear fighting ");
    }
}
