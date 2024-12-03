import java.util.Scanner;

public class AdminLogin {

    // Constants for admin credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";


    public void login() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Login as administrator");
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        // Check if input matches admin credentials
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();

    }
}
