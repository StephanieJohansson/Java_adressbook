import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creating a scanner to read the input from the user via the console
        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager();

        // adding persons in personManager with addPerson method
        // creating persons with the constructor from the Persons-class which receives first- and lastname, age, address, number
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

        // loops through every person added to the personManager and returns the list
        for (Persons person : personManager.getPersons()) {

        }

        System.out.println("Welcome to the phonebook!");
        System.out.println("You're signed in as a guest.");
        while (true) { //Infinity loop for the menu
            //Menu display options
            System.out.println("\nChoose an option:");
            System.out.println("1. Search");
            System.out.println("2. Show list");
            System.out.println("3. Log in as admin");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt(); //Read users choice between 1-2
            scanner.nextLine(); // Clear the input

            if (choice == 1) { //If user chooses 1 for search
                System.out.print("Who do you wanna find?: ");
                String query = scanner.nextLine(); //Read search input
                ArrayList<Persons> results = personManager.search(query); //Perform search

                if (results.isEmpty()) { //If no match is found
                    System.out.println("No results found.");
                } else { //Else display matching persons
                    System.out.println("Found profiles:");
                    for (Persons person : results) {
                        System.out.println(person); //Print contact details
                        System.out.println("--------------------");
                    }
                }
            } else if (choice == 2) { // new code to show the list
                ArrayList<Persons> persons = personManager.getPersons();
                if (persons.isEmpty()) {
                    System.out.println("There is no profiles in this list.");
                } else {
                    System.out.println("List of profiles:");
                    for (Persons person : persons) {
                        System.out.println(person);
                    }
                }
            } else if (choice == 3) { // If user chooses 3 to log in as admin
                AdminLogin adminLogin = new AdminLogin(); // Create an instance of AdminLogin
                boolean loggedOut = adminLogin.login(); // Call the login method

                if (loggedOut) {
                    System.out.println("You have been logged out and are returning to the main menu.");
                }

            } else if (choice == 4) { //If user chooses 4 for exiting
                System.out.println("Exits...");
                break; //Exit loop
            } else { //Handle invalid input
                System.out.println("Invalid selection. Try again.\n");
            }
        }

        scanner.close(); //Close scanner to release resources
    }
}