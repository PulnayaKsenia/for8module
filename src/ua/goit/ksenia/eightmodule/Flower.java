package ua.goit.ksenia.eightmodule;

import java.util.SortedSet;
import java.util.TreeSet;

public class Flower {
    public static void main(String[] args) {
        SortedSet<Rose> roses = new TreeSet<>();
        roses.add(new Rose("Red", 25));
        roses.add(new Rose("White", 7));
        roses.add(new Rose("Black", 5));
        roses.add(new Rose("Yellow", 15));
        roses.add(new Rose("Blue", 9));
        roses.add(new Rose("Pink", 19));
        roses.add(new Rose("Green", 3));


        roses
                .stream()
                .forEach(p -> System.out.println(p));
    }
}
