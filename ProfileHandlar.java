import java.util.ArrayList;
import java.util.Scanner;

public class ProfileHandlar {
    // Instance of PersonManager
    private final PersonManager personManager;

    // Constructor to initialize ProfileHandlar with a PersonManager
    public ProfileHandlar(PersonManager personManager) {
        this.personManager = personManager;
    }

    // Create and add a new profile
    public void addProfile(Scanner scanner) {
        System.out.println("Enter firstname: ");
        String firstName = scanner.nextLine(); // Read first name
        System.out.print("Enter lastname: ");
        String lastName = scanner.nextLine(); // Read last name
        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // Read age
        scanner.nextLine(); // Consume newline
        System.out.print("Enter address: ");
        String address = scanner.nextLine(); // Read address
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine(); // Read phone number

        // Now use personManager to add the profile
        personManager.addPerson(new Persons(firstName, lastName, age, address, phone));
        System.out.println("Profile added successfully.");
    /*
        //Scanner instance for user input
        Scanner scanner = new Scanner(System.in);

        //List to store profiles
        private final ArrayList<Persons> personList;

        //Constructor to initialize the profile list
        public ProfileHandlar() {
            personList = new ArrayList<>();

        }

        //Method for adding person to the list
        public void addPerson(Persons person){

            personList.add(person);
        }

        //Create and add a new profile
        public void addProfile(Scanner scanner){
            System.out.println("Enter firstname: ");
            String firstName = scanner.nextLine(); //Read first name
            System.out.print("Enter lastname:");
            String lastName = scanner.nextLine(); //Read last name
            System.out.print("Enter age: ");
            int age = scanner.nextInt(); //Read age
            scanner.nextLine(); // Consume newline
            System.out.print("Enter address: ");
            String address = scanner.nextLine(); //Read address
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine(); //Read phone number

            personList.add(new Persons(firstName, lastName, age, address, phone));
            System.out.println("Profile added successfully.");*/
        }

        //Remove profile base on first and last name
       public void removeProfile(Scanner scanner) {
        System.out.print("Enter firstname of the profile you want to remove: ");
        String firstName = scanner.nextLine(); //Read first name
        System.out.print("Enter lastname of the profile you want to remove: ");
        String lastName = scanner.nextLine(); //Read last name

           //Use removeIF to find and remove matching profiles
        boolean removed = personManager.getPersons().removeIf(person ->
                person.getFirstName().equalsIgnoreCase(firstName) &&
                        person.getLastName().equalsIgnoreCase(lastName));
        if (removed) {
            System.out.println("Profile removed");
        } else {
            System.out.println("No profile with this firstname and lastname.");
            }
        }

        //Method for updating profile details
        public void updateProfile(Scanner scanner) {
            System.out.print("Enter the firstname of the profile you want to update: ");
            String firstName = scanner.nextLine(); //Read first name
            System.out.print("Enter lastname of the profile you want to update: ");
            String lastName = scanner.nextLine(); //Read last name

            //Check list to find matching profile
            for (Persons person : personManager.getPersons()) {
                if (person.getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine(); //Read new address
                    System.out.print("Enter new phone number: ");
                    String newPhone = scanner.nextLine(); //Read new phone number
                    person.setAddress(newAddress); //Update address
                    person.setPhone(newPhone); //Update phone number
                    System.out.println("Profile update.");
                    return; //Exit method after updating profile
                }
            }
            System.out.println("Cant find a profile with this name.");
        }

        //Display all profiles
        public void showAllProfiles(){
            if(personManager.getPersons().isEmpty()) {
                System.out.println("No profiles.");
            } else {
                System.out.println("Profiles:");
                for (Persons person : personManager.getPersons()){
                    System.out.println(person);
                }
            }


            /*scanner.close(); //Close scanner to release resources*/
        }

    }










