public class INHERETANCE {
    public static void main(String args[]) {
        Fish shark=new Fish();
        shark.eats();
        shark.breath();
        shark.swim();
        Dogs lulu = new Dogs();
        lulu.eats();
        lulu.lay();
        lulu.leg();
        Birds sparrow=new Birds();
        sparrow.wings="sparrows have two wings";
        sparrow.fly();
        System.out.println(sparrow.wings);
    }
}

// types of inheretance 
// 1. single-level inheretance
// 2. multi-level inheretance
// 3. hierarechical inheretance







class Animal {

    void eats() {
        System.out.println("eatss...");
    }
    void breath() {
        System.out.println("breathss...");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swimss....");
    }
}
class Mammal extends Animal {
    void lay() {
        System.out.println("mammal can't lay eggss except platypus(Ornithorhynchus anatinus)....");
    }
}

class Dogs extends Mammal {
    String syntificName="Canis lupus familiaris";
    void leg() {
        System.out.println("has for legs......");
    }
}
class Birds {
    String wings;
    void fly() {
        System.out.println("Birs can fly...");
    }
}

