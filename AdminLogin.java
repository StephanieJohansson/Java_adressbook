import java.util.ArrayList;
import java.util.Scanner;

public class AdminLogin {

    // Constants for admin credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    // Instance of ProfileHandlar
    private final ProfileHandlar profileHandlar;

    // Constructor
    public AdminLogin(PersonManager personManager) {
        this.profileHandlar = new ProfileHandlar(personManager);
    }

    PersonManager personManager = new PersonManager();


    // Admin login process
    public boolean login() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Login as administrator");
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        // Check if input matches admin credentials
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login successful");
            System.out.println("You're signed in as admin.");

            // Admin menu loop
            boolean loggedIn = true;
            int adminChoice;

            do {
                System.out.println("What do you want to do?");
                System.out.println("1. Add a new profile");
                System.out.println("2. Delete a profile");
                System.out.println("3. Update a profile");
                System.out.println("4. Search a profile");
                System.out.println("5. Show list");
                System.out.println("6. Sign out");
                System.out.println("Please enter your choice: ");

                // Check if user input is an integer
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Try again");
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

                    case 5: // View the list

                    case 6:
                        System.out.println("Signing out...");
                        loggedIn = false; // exit the admin menu and return to main class
                        break;
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            } while (loggedIn);
            return true; // (adminChoice < 1 || adminChoice > 6); // Repeat until valid choice 1-6
        } else {
            System.out.println("Invalid username or password. Returning to main menu...");
            return false; // Return to main menu if credentials are incorrect
        }
    }
}
