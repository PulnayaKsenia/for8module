package ua.goit.ksenia.eightmodule;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//  for 9 module
        CaesarCode caesarCode = new CaesarCode();

        String representation = "HELLO! It's our flower shop.\n" +
                "There are the most beautiful and fresh flowers from Ukraine, Netherlands and Ecuador!!!";

        String encryptRepresentation = caesarCode.encrypt(representation, 3);
        String decryptRepresentation = caesarCode.decrypt(representation, 5);

        System.out.println("Encrypted Representation: " + encryptRepresentation + ".\n " +
                "Decrypted Representation: " + decryptRepresentation + ".");

//  created collection of different classes
        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();

        ArrayList<Flower> flowers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            flowers.add(new Rose("white", 5));
        }

        for (int i = 0; i < 9; i++) {
            flowers.add(new Chamomile(4));
        }

        for (int i = 0; i < 8; i++) {
            flowers.add(new Aster(4));
        }
        bouquetOfFlowers.setFlowers(flowers);

        Map<String, Integer> bouquet = new HashMap<>();
        bouquet.put("roses", 5);
        bouquet.put("chamomiles", 4);
        bouquet.put("asters", 4);

        System.out.println("This bouquet consist of:");
        for (Map.Entry newBouquet : bouquet.entrySet()) {
            System.out.println(newBouquet.getValue() + " " + newBouquet.getKey() + ", ");
        }

//  created an ordered list without Collections.sort()
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
