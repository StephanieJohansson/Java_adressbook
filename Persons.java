// defines a class which represents a person
public class Persons {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    // constructor to creat a person with all the specified properties
    public Persons(String firstName, String lastName, int age, String address, int i, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

     // retrieve first name
    public String getFirstName() {
        return firstName;
    }
    // retrieve last name
    public String getLastName() {
        return lastName;
    }
    // retrieve age
    public int getAge() {
        return age;
    }
    // retrieve address
    public String getAddress() {
        return address;
    }
    // retrieve phone number
    public String getPhone() {
        return phone;
    }

    // override to get a more readable representation
   @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + address + " " + phone + "\n";
   }
}

