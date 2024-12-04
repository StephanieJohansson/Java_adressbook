import java.util.Scanner;

public class AdminLogin {

    // Constants for admin credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";


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

            // Admin menu
            while (true) {
                System.out.println("Welcome " + ADMIN_USERNAME);
                System.out.println("1. Add a new profile");
                System.out.println("2. Delete a profile");
                System.out.println("3. Update a profile");
                System.out.println("4. Sign out");

                int adminChoice = scanner.nextInt();
                scanner.nextLine();

                switch (adminChoice) {
                    case 1:
                        System.out.println("Add a new profile");
                        // ........ code to add a new profile
                        break;
                    case 2:
                        System.out.println("Delete a profile");
                        // ........ code to delete a profile
                        break;
                    case 3:
                        System.out.println("Update a profile");
                        // ........ code to update a profile
                        break;
                    case 4:
                        System.out.println("Signing out...");
                        return true; // exit the admin menu and return to main class
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            }
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }

        // scanner.close();

    }
}
