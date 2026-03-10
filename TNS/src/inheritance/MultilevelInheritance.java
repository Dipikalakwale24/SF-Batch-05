package inheritance;

class AnimalML {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class DogML extends AnimalML {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class PuppyML extends DogML {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        PuppyML p = new PuppyML();

        p.eat();
        p.bark();
        p.weep();

    }

}