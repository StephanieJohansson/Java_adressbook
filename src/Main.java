import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProfileHandlar profileHandlar = new ProfileHandlar();


        profileHandlar.addPerson(new Person("Anna", "Svensson", 28, "Storgatan", "070-123 45 67"));
        profileHandlar.addPerson(new Person("Erik", "Johansson", 34, "Storgatan", "070-234 56 78"));
        profileHandlar.addPerson(new Person("Sara", "Andersson", 22, "Långgatan", "070-345 67 89"));
        profileHandlar.addPerson(new Person("Johan", "Karlsson", 45, "Kortgatan","070-456 78 90"));
        profileHandlar.addPerson(new Person("Anna", "Nilsson", 31, "Storgatan",  "070-567 89 01"));
        profileHandlar.addPerson(new Person("Erik", "Olsson", 29, "Parkgatan", "070-678 90 12"));
        profileHandlar.addPerson(new Person("Maria", "Persson", 40, "Långgatan","070-789 01 23"));
        profileHandlar.addPerson(new Person("Johan", "Svensson", 36, "Storgatan","070-890 12 34"));
        profileHandlar.addPerson(new Person("Sara", "Karlsson", 26, "Kortgatan","070-901 23 45"));
        profileHandlar.addPerson(new Person("Anna", "Johansson", 33, "Storgatan", "070-012 34 56"));
        profileHandlar.addPerson(new Person("Erik", "Andersson", 38, "Långgatan", "070-123 45 67"));
        profileHandlar.addPerson(new Person("Maria", "Nilsson", 27, "Parkgatan", "070-234 56 78"));
        profileHandlar.addPerson(new Person("Johan", "Olsson", 42, "Storgatan", "070-345 67 89"));
        profileHandlar.addPerson(new Person("Sara", "Persson", 24, "Kortgatan","070-456 78 90"));
        profileHandlar.addPerson(new Person("Erik", "Svensson", 30, "Långgatan", "070-567 89 01"));
        profileHandlar.addPerson(new Person("Anna", "Karlsson", 35, "Storgatan","070-678 90 12"));
        profileHandlar.addPerson(new Person("Maria", "Johansson", 29, "Parkgatan", "070-789 01 23"));
        profileHandlar.addPerson(new Person("Johan", "Nilsson", 50, "Storgatan", "070-890 12 34"));
        profileHandlar.addPerson(new Person("Sara", "Olsson", 21, "Kortgatan", "070-901 23 45"));
        profileHandlar.addPerson(new Person("Erik", "Persson", 39, "Långgatan", "070-012 34 56"));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add new profile");
            System.out.println("2. Delete profile");
            System.out.println("3. Update profile");
            System.out.println("4. View all profiles");
            System.out.println("5. Quit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumera ny rad

            switch (choice) {
                case 1:
                    profileHandlar.addProfile(scanner);
                    break;
                case 2:
                    profileHandlar.removeProfile(scanner);
                    break;
                case 3:
                    profileHandlar.updateProfile(scanner);
                    break;
                case 4:
                    profileHandlar.showAllProfiles();
                    break;
                case 5:
                    running = false;
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Try again.");
            }
        }

        scanner.close();
    }
}
