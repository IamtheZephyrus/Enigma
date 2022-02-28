package com.company;

import java.util.Scanner;

public class Encoders {
    public Encoders() {
    }

    public String caesar(boolean encrypt) {
        StringBuilder encodedMessage = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input text to be encrypted");
        String message = scanner.nextLine().toUpperCase();

        System.out.println("please input shift key");
        int key = scanner.nextInt();

        for (Character c : message.toCharArray()) {
            int pivot = c - 'a';
            if(encrypt){
                int temp = pivot + key;
                encodedMessage.append((char) ((temp + '0') %26));
            } else {
                int temp = pivot - key;
                encodedMessage.append((char) ((temp - '0')%26));
            }
    }
        return encodedMessage.toString();
    }



        /*public String vigenere (String message, String key, boolean encrypt){
            StringBuilder encodedMessage = new StringBuilder();
            int i = 0;
            char[] keyArray = key.toCharArray();
            for(Character c: message.toCharArray()){
                if(encrypt){
                    encodedMessage.append(c + keyArray[i]);
                    i++;
                } else {
                    encodedMessage.append(c - keyArray[i]);
                    i++;
                }
                //Length -1 since index starts at 0
                if(i > key.length() -1){
                    i = 0;
                }
            }
            return encodedMessage.toString();
        }
         */

}
