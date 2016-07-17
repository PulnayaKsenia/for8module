package ua.goit.ksenia.eightmodule;

import java.util.ArrayList;
import java.util.List;

public class CesarCod {
    private final static List<Character> englishAlphabet = new ArrayList<Character>();
    private final static char[] punctuation = {'.', ',', ';', ':', '!', '?', '-'};

    CesarCod() {
        for (char c = 'a'; c <= 'z'; c++) {
            englishAlphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            englishAlphabet.add(c);
        }
        for (char c : punctuation) {
            englishAlphabet.add(c);
        }
    }

    public String encrypt(String text, int m, int n) {
        int abc = 26;
        m = m % abc;
        n = n % abc;
        if (gcd(m, n) != 1) {
            return null;
        }

        StringBuilder cryptogram = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = englishAlphabet.indexOf(c);
            index = (index * m + n) % abc;
            cryptogram.append(englishAlphabet.get(index));
        }
        return cryptogram.toString();
    }

    public String decrypt(String text, int m, int n) {
        int abc = 26;
        m = m % abc;
        n = n % abc;
        int reversedM = -1;

        for (int i = 0; i < abc; i++) {
            if ((i * m) % abc == 1) {
                reversedM = i;
                break;
            }
        }

        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = englishAlphabet.indexOf(c);
            index = (((index - n) * reversedM) % abc + abc) % abc;
            newText.append(englishAlphabet.get(index));
        }
        return newText.toString();
    }

    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}
