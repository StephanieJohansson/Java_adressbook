import java.util.ArrayList;
import java.util.Scanner;

public class AdminLogin {

    // Constants for admin credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    // Instance of ProfileHandlar
    private final ProfileHandlar profileHandlar;
    private final PersonManager personManager;

    // Constructor
    public AdminLogin(PersonManager personManager) {
        this.personManager = personManager;
        this.profileHandlar = new ProfileHandlar(personManager);
    }

    // Admin login process
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSIGN IN");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if input matches admin credentials
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            logInSuccessful();

            // Admin menu loop
            boolean loggedIn = true;
            int adminChoice;

            do {
                adminMenu();

                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input, try again: ");
                    scanner.next();
                }
                adminChoice = scanner.nextInt();
                scanner.nextLine();

                switch (adminChoice) {
                    case 1:
                        System.out.println("Add a new profile");
                        profileHandlar.addProfile(scanner); // Call addProfile method
                        break;
                    case 2:
                        System.out.println("Delete a profile");
                        profileHandlar.removeProfile(scanner); // Call removeProfile method
                        break;
                    case 3:
                        System.out.println("Update a profile");
                        profileHandlar.updateProfile(scanner); // Call updateProfile method
                        break;
                    case 4: // Search list
                        searchProfile(scanner);
                        break;
                    case 5: // View the list
                        showProfiles();
                        break;
                    case 6:
                        System.out.println("\nSigning out...");
                        loggedIn = false; // exit the admin menu and return to main class
                        break;
                    default:
                        System.out.print("Invalid choice, try again: ");
                }
            } while (loggedIn);
            return true; // (adminChoice < 1 || adminChoice > 6); // Repeat until valid choice 1-6
    } else {
        System.out.println("Invalid username or password. Returning to main menu...");
        return false; // Return to main menu if credentials are incorrect
    }

}

    private void searchProfile(Scanner scanner) {
        System.out.println("Search");
        System.out.print("Who do you wanna find?: ");
        String query = scanner.nextLine(); //Read search input
        ArrayList<Persons> results = personManager.search(query); //Perform search

        if (results.isEmpty()) { //If no match is found
            System.out.println("No results found.");
        } else { //Else display matching persons
            System.out.println("\nFound profiles:");
            for (Persons person : results) {
                System.out.println(person); //Print contact details
                System.out.println("--------------------");
            }
        }
    }

    private void showProfiles() {
        ArrayList<Persons> persons = personManager.getPersons();
        if (persons.isEmpty()) {
            System.out.println("There are no profiles in this list.");
        } else {
            System.out.println("\n-----------------------------------------------");
            System.out.println("List of profiles:");
            for (Persons person : persons) {
                System.out.println(person);
            }
            System.out.println("-----------------------------------------------");
        }
    }

    private void logInSuccessful() {
        System.out.println("\n--------------------------");
        System.out.println("Login successful!");
        System.out.println("You're signed in as admin.");
        System.out.println("--------------------------");
    }

    private void adminMenu() {
        System.out.println("\nADMIN MENU");
        System.out.println("1. Add a new profile");
        System.out.println("2. Delete a profile");
        System.out.println("3. Update a profile");
        System.out.println("4. Search a profile");
        System.out.println("5. Show list");
        System.out.println("6. Sign out");
        System.out.print("Please enter your choice: ");
    }

}
