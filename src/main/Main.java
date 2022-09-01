package main;

import animals.*;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Cat("Кузя",6), new Dog("Шарик",1),
                new Cow("Олег",12), new AngryDog("Василий",3)};
        for (Animal animal : animals) {
            animal.voice();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
