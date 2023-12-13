public class Interface {
    public static void main(String args[]) {
        // Queen q= new Queen();
        // q.move();
        // System.out.println(q.color);
        Omnivore o = new Omnivore();
        o.eats();
    }
}


//total abstraction
interface Chess {
    void move();
    String color = "white";
} 

class Queen implements Chess {
    public void move() {  //function will be public becouse interface function is always public and we are implemention the same method theirfore the method need to be of same type
        System.out.println("Up, Down, Left, Right, Left Diognal, Right Diognal");
    }
    // String color = "black";

}

class Rook implements Chess {
    public void move() {
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements Chess {
    public void move() {
        System.out.println("Up, Down, Left, Right, Left Diognal, Right Diognal(by one squar)");
    }
}

//multiple inheritance

interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Omnivore implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Omnivore eats both plants and animals..");
    }
}
