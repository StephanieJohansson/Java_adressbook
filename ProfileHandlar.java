import java.util.ArrayList;
import java.util.Scanner;

public class ProfileHandlar {

        Scanner scanner = new Scanner(System.in);
        private final ArrayList<Persons> personList;

        public ProfileHandlar() {
            personList = new ArrayList<>();

        }

        public void addPerson(Persons person){

            personList.add(person);
        }

        public void addProfile(Scanner scanner){
            System.out.println("Enter firstname: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter lastname:");
            String lastName = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Konsumera ny rad
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();

            personList.add(new Persons(firstName, lastName, age, address, phone));
            System.out.println("Profile added successfully.");
        }

       public void removeProfile(Scanner scanner) {
        System.out.print("Enter firstname of the profile you want to remove: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter lastname of the profile you want to remove: ");
        String lastName = scanner.nextLine();
        boolean removed = personList.removeIf(person ->
                person.getFirstName().equalsIgnoreCase(firstName) &&
                        person.getLastName().equalsIgnoreCase(lastName));
        if (removed) {
            System.out.println("Profile removed");
        } else {
            System.out.println("No profile with this firstname and lastname.");
            }
        }

        public void updateProfile(Scanner scanner) {
            System.out.print("Enter the firstname of the profile you want to update: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter lastname of the profile you want to update: ");
            String lastName = scanner.nextLine();
            for (Persons person : personList) {
                if (person.getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhone = scanner.nextLine();
                    person.setAddress(newAddress);
                    person.setPhone(newPhone);
                    System.out.println("Profile update.");
                    return;
                }
            }
            System.out.println("Cant find a profile with this name.");
        }
        public void showAllProfiles(){
            if(personList.isEmpty()) {
                System.out.println("No profiles.");
            } else {
                System.out.println("Profiles:");
                for (Persons Person : personList){
                    System.out.println(Person);
                }
            }

        }

    }










