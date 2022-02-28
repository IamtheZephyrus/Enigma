package com.company;

import java.util.Scanner;


public class MainMenuUI {
    private Scanner scanner;
    private MainMenuUI main;
    private Encoders encoders;
    private int choice1;
    private int choice2;
    private String message;

    public MainMenuUI()
    {
        scanner = new Scanner(System.in);
        encoders = new Encoders();

    }

    public void startApp()
    {
        printMenu();

        while(true) {
            if (choice1 == 1){
                if(choice2 == 1){
                    System.out.println(encoders.caesar(true));
                } else if (choice2 == 2){
                    System.out.println(encoders.caesar(false));
                }
            }

            if (choice1 == 2) {
                if(choice2 == 1){

                } else if (choice2 == 2){

                }
            }
            if (choice1 == 3) {
                break;
            }
            printMenu();
        }

    }

    private void printMenu()
    {
        System.out.println("1 to use caesar");
        System.out.println("2 to use vigenere");
        System.out.println("(3) exit");
        choice1 = scanner.nextInt();
        System.out.println("Hello here you encrypt or decrypt your text :) ");
        System.out.println("(1) encrypt text");
        System.out.println("(2) decrypt text");


        choice2 = scanner.nextInt();

    }

}