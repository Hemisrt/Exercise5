package com.company.Greenlee;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

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

    // Menu - Provides a list of options
    public static int menu() {
        System.out.println("Please choose an option:\n" +
                "(1) Add name and email.\n" +
                "(2) Search for name and get email.\n" +
                "(3) Replace email to an existing name.\n" +
                "(0) Exit.");
        int option = input.nextInt();
        return option;
    }

    // Scanner
    public static Scanner input = new Scanner(System.in);

    // Class field from the PersonInfo class
    public static Person person;

    // HashMap - The address book contains the Key which is the name and the Value which is the email
    public static Map<String, String> book = new HashMap<>();

    // addInformation() - Asks user to enter their name and email
    // and adds the information to the HashMap which is the address book
    public static void addInformation() {
        Scanner input = new Scanner(System.in);
        Scanner address = new Scanner(System.in);

        System.out.println("Enter first and last name(Ex: John Doe): ");
        String name = input.nextLine();

        System.out.println("Enter email: ");
        String email = address.nextLine();

        person = new Person(name, email);
        System.out.println("\nAdding name and email to the address book...");
        book.put(person.getName(), person.getEmail());
        System.out.println("The Name: " + person.getName() + " and Email: " + person.getEmail() + ", has been added to the address book.\n");
    }

    // replaceEmail() - Asks user to enter a name from the HashMap(address book)
    // and asks the user to enter the new email
    public static void replaceEmail() {
        Scanner input = new Scanner(System.in);
        Scanner email = new Scanner(System.in);

        System.out.println("Select a name that is available in the address book: ");
        String name = input.nextLine();

        for (Map.Entry<String, String> entry : book.entrySet()) {
            while (!(name.equals(entry.getKey()))) {
                System.out.println("That name is not in the book, please try again: ");
                name = input.nextLine();
            }
            System.out.println("Replace a new email for the name: " + name + ": ");
            String anotherEmail = email.nextLine();
            entry.setValue(anotherEmail);
            System.out.println("Email for the name: " + name + ", has been replaced.\n");
        }
    }

    // search() - Asks user to enter the name from the HashMap(address book) and displays the email to the user.
    public static void search() {
        System.out.println("Type in a name 'First Last' with exact casing(Ex: John Doe): ");
        String name = input.nextLine();

        for (Map.Entry<String, String> entry : book.entrySet()) {
            while (!(name.equals(entry.getKey()))) {
                System.out.println("That name is not in the book, please try again: ");
                name = input.nextLine();
            }
            System.out.println(name + ", Email: " + entry.getValue() + "\n");
        }
    }
}
