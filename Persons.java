// defines a class named Persons
public class Persons {

    // defines five private field to capsule the information of the profiles
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    // constructor to create a person with all the specified properties
    public Persons(String firstName, String lastName, int age, String address, int i,String phone) {
        // assigning values to the instance variable with 'this'
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    // getter-methods to get the values of the instance variables to get access to the object data
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

    // setter-methods for the admin-user to be able to update profiles address and phone number
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // override to get a more readable representation
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + ", " + address + ", " + phone;
    }
}

