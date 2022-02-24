package generics.task5;

import java.util.Arrays;

public class PetHouse <T extends Animal> {

    T[] animals;

    public PetHouse(T[] animals) {
        this.animals = animals;
    }

    public T[] getAnimals() {
        return animals;
    }

    public void setAnimals(T[] animals) {
        this.animals = animals;
    }

}
