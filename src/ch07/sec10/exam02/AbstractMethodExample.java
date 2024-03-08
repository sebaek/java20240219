package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        
        animalSound(dog);
        animalSound(cat);

        animalSound(new Dog());
        animalSound(new Cat());


    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
