public class poly {
    public static void main(String [] args) {
        Deer d = new Deer();
        // Animal a= new Animal();
        // a.eat();
        d.eat();
        
        // Calculate ab = new Calculate();
        // System.out.println(ab.sum(5, 7));
        // System.out.println(ab.sum((float)4.5, (float) 7.5));
        // System.out.println(ab.sum(8,4,2));
    }
}
//method overloading or function overloding
class Calculate {
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

//method overriding or function overriding

class Animal {
    void eat() {
        System.out.println("animal eats....");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("deer eats...grasss....");
    }
}