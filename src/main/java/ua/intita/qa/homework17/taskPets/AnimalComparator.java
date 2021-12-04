package ua.intita.qa.homework17.taskPets;

import java.util.Comparator;
import java.util.Locale;

public class AnimalComparator implements Comparator<Animal> {
    public int compare(Animal a, Animal b){
        return a.getName().toUpperCase(Locale.ROOT).compareTo(b.getName().toUpperCase(Locale.ROOT));
    }

    @Override
    public Comparator<Animal> reversed() {
        return Comparator.super.reversed();
    }

}
