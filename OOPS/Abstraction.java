public class Abstraction {
    public static void main(String [] args) {
        // Horse h =new Horse();
        // h.walk();
        // Chicken c = new Chicken();
        // c.walk();
        Mustang m = new Mustang();
        System.out.println(m.color);
        m.changeColor();
        System.out.println(m.color); 
        Horse h = new Horse();
        Mm mm = new Mm();

    }
}

abstract class Animal {
    String color = "brown";
    Animal() {
        System.out.println("Animal class constructor is called...");
        eat();
    }
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse class constructor is called...");
    }
    void walk() {
        System.out.println("Horse walk on four legs");
    }
}
class Mustang extends Horse {
    void changeColor() {
        color="black";
    }
    Mustang() {
        System.out.println("Mustang class constructor is called...");
    }
    void eat() {
        System.out.println("Mustang eat grass..");
    }
}
class Mm extends Mustang {

}
class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walk on two legs");
    }
}