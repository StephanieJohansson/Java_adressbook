import java.util.ArrayList;
import java.util.Scanner;

public class ProfileHandlar {
    Scanner scanner = new Scanner(System.in);
        private final ArrayList<Person> personList;

        public ProfileHandlar() {
            personList = new ArrayList<>();
        }


        public void addPerson(Person person){
            personList.add(person);
        }


        public void addProfile(Scanner scanner){
               System.out.println("Enter firstname: ");
               String firstName = scanner.nextLine();
               System.out.print("Enter lastname:");
               String lastName = scanner.nextLine();
               System.out.print("Enter older: ");
               int age = scanner.nextInt();
               scanner.nextLine(); // Konsumera ny rad
               System.out.print("Enter address: ");
               String address = scanner.nextLine();
               System.out.print("Enter telefonnumber: ");
               String phone = scanner.nextLine();

               personList.add(new Person(firstName, lastName, age, address, phone));
               System.out.println("Quit.");}

           public void removeProfile(Scanner scanner) {
               System.out.print("Enter firstname an profile you will delete: ");
               String firstName = scanner.nextLine();
               boolean removed = personList.removeIf(person -> person.getFirstName().equalsIgnoreCase(firstName));
               if (removed) {
                   System.out.println("Profile removed");
               } else {
                   System.out.println("No profile with this firstname.");
               }
           }

           public void updateProfile(Scanner scanner) {
               System.out.print("Enter firstname an profile you will update: ");
               String firstName = scanner.nextLine();
               for (Person person : personList) {
                   if (person.getFirstName().equalsIgnoreCase(firstName)) {
                       System.out.print("Enter new address: ");
                       String newAddress = scanner.nextLine();
                       System.out.print("Enter new telefonnubmer: ");
                       String newPhone = scanner.nextLine();
                       person.setAddress(newAddress);
                       person.setPhone(newPhone);
                       System.out.println("Profile update.");
                       return;
                   }
               }
               System.out.println("No profile with this firstname.");
           }
           public void showAllProfiles(){
            if(personList.isEmpty()) {
                System.out.println("No profiles.");
            } else {
                System.out.println("Profiles:");
                for (Person Person : personList){
                    System.out.println(Person);
                }
              }
           }
       }





