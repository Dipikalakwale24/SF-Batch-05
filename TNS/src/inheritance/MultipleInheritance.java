package inheritance;

interface AnimalInterface {
    void eat();
}

interface PetInterface {
    void play();
}

class DogMultiple implements AnimalInterface, PetInterface {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        DogMultiple d = new DogMultiple();

        d.eat();
        d.play();

    }

}