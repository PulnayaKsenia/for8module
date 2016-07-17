package ua.goit.ksenia.eightmodule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BouquetOfFlowers {
    public static void main(String[] args) {
        CesarCod cesarCod = new CesarCod();

        String representation = "HELLO! It's our flower shop.\n" +
                "There are the most beautiful and fresh flowers from Ukraine,Netherlands and Ecuador!!!";

        String encryptRepresentation = cesarCod.encrypt(representation, 3, 5);
        String decryptRepresentation = cesarCod.decrypt(representation, 5, 3);

        System.out.println("Encrypted Representation: " + encryptRepresentation + ".\n " +
                "Decrypted Representation: " + decryptRepresentation + ".");

        BouquetOfFlowers bouquetF = new BouquetOfFlowers();

        ArrayList<Flower> flower = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            flower.add(new Rose("white", 5));
        }

        for (int i = 0; i < 9; i++) {
            flower.add(new Chamomile(4));
        }

        for (int i = 0; i < 8; i++) {
            flower.add(new Aster(4));
        }
        bouquetF.setFlowers(flower);

        Map<String, Integer> bouquet = new HashMap<>();
        bouquet.put("rose", 5);
        bouquet.put("chamomile", 4);
        bouquet.put("aster", 4);

        flower
                .stream()
                .forEach(f -> System.out.println(f));
    }

    private List<Flower> flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
}

