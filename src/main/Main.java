package main;

import animals.*;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Cat("����",6), new Dog("�����",1),
                new Cow("����",12), new AngryDog("�������",3)};
        for (Animal animal : animals) {
            animal.voice();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
