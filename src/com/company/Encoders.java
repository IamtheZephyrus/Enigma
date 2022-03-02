package com.company;

import java.util.Scanner;

public class Encoders {
    public Encoders() {
    }

    // Ceasar
    public String caesar(boolean encrypt) {
        StringBuilder encodedMessage = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input text to be encrypted");
        String message = scanner.nextLine().toLowerCase();

        System.out.println("please input shift key");
        int key = scanner.nextInt();

        for (Character c : message.toCharArray()) {
            int pivot = c - 'a';
            if (encrypt) {
                int originalAlphabetPosition = c - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                encodedMessage.append(newCharacter);
            } else {
                int originalAlphabetPosition = c - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                char newCharacter = (char) ('a' - newAlphabetPosition);
                encodedMessage.append(newCharacter);
            }
        }
        return encodedMessage.toString();
    }

    //Vigenere
    public static String encrypt(String text, final String key) {

        String res = "";

        text = text.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c < 'A' || c > 'Z')

                continue;

            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');

            j = ++j % key.length();

        }

        return res;

    }
}

/*
    public static String decrypt(String text, final String key) {

        String res = "";

        text = text.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c < 'A' || c > 'Z')

                continue;

            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');

            j = ++j % key.length();

        }

        return res;

    }
}*/
