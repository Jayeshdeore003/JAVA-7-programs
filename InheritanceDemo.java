// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is Eating...");
    }
}

// Single inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is Barking...");
    }
}

// Multilevel inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is Weeping...");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {

        // Single inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        // Multilevel inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}