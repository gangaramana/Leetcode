package cracking_the_coding_interview.stacks;

import java.util.LinkedList;
import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Shelter animalShelter = new Shelter();
        animalShelter.insertCat('c');

    }


}

class Shelter {
    private LinkedList<Character> cats;
    private LinkedList<Character> dogs;

    public Shelter() {
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
    }


    public Character getDog() {
        return dogs.getFirst();
    }

    public Character getCat() {
        return cats.getFirst();
    }

    public Character dequeueAny() {
        return cats.getFirst();
    }

    public boolean insertDog(Character character) {
        return dogs.add(character);
    }

    public boolean insertCat(Character character) {
        return cats.add(character);
    }

}
