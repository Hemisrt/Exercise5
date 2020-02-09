package com.company.Greenlee;

import java.util.Scanner;

public class Main {
    // Trenton Greenlee
    // 2/8/2020
    // Exercise 5
    public static void main(String[] args) {
        int prompt = menu();
        while (prompt != 0) {
            switch (prompt) {
                case 1:
                    AddressBook.addInformation();
                    prompt = menu();
                    break;
                case 2:
                    AddressBook.search();
                    prompt = menu();
                    break;
                case 3:
                    AddressBook.replaceEmail();
                    prompt = menu();
                    break;
                default:
                    System.out.println("That is not an option, please ask again.");
                    prompt = menu();
                    break;
            }
        }
    }
    // Methods
    // Scanner
    public static Scanner input = new Scanner(System.in);

    // Menu - Provides a list of options
    public static int menu() {
        System.out.println("Please choose an option:\n" +
                "(1) Add name and email.\n" +
                "(2) Search for name and get email.\n" +
                "(3) Add another email to an existing name.\n" +
                "(0) Exit.");
        int option = input.nextInt();
        return option;
    }
}