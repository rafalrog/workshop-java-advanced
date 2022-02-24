package generics.task5;

import java.util.Arrays;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Azor", "long"),
                new Cat("Klakier", "sharp")
        };

        PetHouse<Animal> petHouse = new PetHouse<>(animals);
        System.out.println(Arrays.toString(petHouse.getAnimals()));

    }
}
