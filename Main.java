import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager();


        personManager.addPerson(new Persons("Anna", "Svensson", 28, "Storgatan", 10, "070-123 45 67"));
        personManager.addPerson(new Persons("Erik", "Johansson", 34, "Storgatan", 15, "070-234 56 78"));
        personManager.addPerson(new Persons("Sara", "Andersson", 22, "Långgatan", 5, "070-345 67 89"));
        personManager.addPerson(new Persons("Johan", "Karlsson", 45, "Kortgatan", 7, "070-456 78 90"));
        personManager.addPerson(new Persons("Anna", "Nilsson", 31, "Storgatan", 20, "070-567 89 01"));
        personManager.addPerson(new Persons("Erik", "Olsson", 29, "Parkgatan", 12, "070-678 90 12"));
        personManager.addPerson(new Persons("Maria", "Persson", 40, "Långgatan", 3, "070-789 01 23"));
        personManager.addPerson(new Persons("Johan", "Svensson", 36, "Storgatan", 8, "070-890 12 34"));
        personManager.addPerson(new Persons("Sara", "Karlsson", 26, "Kortgatan", 4, "070-901 23 45"));
        personManager.addPerson(new Persons("Anna", "Johansson", 33, "Storgatan", 14, "070-012 34 56"));
        personManager.addPerson(new Persons("Erik", "Andersson", 38, "Långgatan", 6, "070-123 45 67"));
        personManager.addPerson(new Persons("Maria", "Nilsson", 27, "Parkgatan", 9, "070-234 56 78"));
        personManager.addPerson(new Persons("Johan", "Olsson", 42, "Storgatan", 11, "070-345 67 89"));
        personManager.addPerson(new Persons("Sara", "Persson", 24, "Kortgatan", 2, "070-456 78 90"));
        personManager.addPerson(new Persons("Erik", "Svensson", 30, "Långgatan", 5, "070-567 89 01"));
        personManager.addPerson(new Persons("Anna", "Karlsson", 35, "Storgatan", 1, "070-678 90 12"));
        personManager.addPerson(new Persons("Maria", "Johansson", 29, "Parkgatan", 3, "070-789 01 23"));
        personManager.addPerson(new Persons("Johan", "Nilsson", 50, "Storgatan", 19, "070-890 12 34"));
        personManager.addPerson(new Persons("Sara", "Olsson", 21, "Kortgatan", 10, "070-901 23 45"));
        personManager.addPerson(new Persons("Erik", "Persson", 39, "Långgatan", 8, "070-012 34 56"));

        for (Persons person : personManager.getPersons()) {
            System.out.print(person);
        }

        System.out.println("Välkommen till Telefonboken!");
        System.out.println("Du är inloggad som gäst.");
        while (true) { //Infinity loop for the menu
            //Menu display options
            System.out.println("\nVälj ett alternativ:");
            System.out.println("1. Sök");
            System.out.println("2. Logga in som admin");
            System.out.println("3. Avsluta");
            System.out.print("Ditt val: ");
            int choice = scanner.nextInt(); //Read users choice between 1-2
            scanner.nextLine(); // Clear the input

            if (choice == 1) { //If user chooses 1 for search
                System.out.print("Vem vill du hitta?: ");
                String query = scanner.nextLine(); //Read search input
                ArrayList<Persons> results = personManager.search(query); //Perform search

                if (results.isEmpty()) { //If no match is found
                    System.out.println("Inga resultat hittades.");
                } else { //Else display matching persons
                    System.out.println("Hittade kontakter:");
                    for (Persons person : results) {
                        System.out.println(person); //Print contact details
                        System.out.println("--------------------");
                    }
                }
            } else if (choice == 2) { // If user chooses 2 to log in as admin
                AdminLogin adminLogin = new AdminLogin(); // Create an instance of AdminLogin
                boolean loggedOut = adminLogin.login(); // Call the login method

                if (loggedOut) {
                    System.out.println("Du har loggats ut och återanvänder till huvudmenyn.");
                }

            } else if (choice == 3) { //If user chooses 3 for exiting
                System.out.println("Avslutar...");
                break; //Exit loop
            } else { //Handle invalid input
                System.out.println("Ogiltigt val. Försök igen.");
            }
        }

        scanner.close(); //Close scanner to release resources
    }
}