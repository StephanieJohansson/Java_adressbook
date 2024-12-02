public class Persons {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    public Persons(String firstName, String lastName, int age, String address, int i, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

   @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + address + " " + phone + "\n";
   }
}

