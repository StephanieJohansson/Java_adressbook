
public class Person {

        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phone;

        public Person(String firstName, String lastName, int age, String address, String phone) {
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
        public void setAddress(String address){
            this.address = address;
       }
       public void setPhone(String phone){
            this.phone = phone;
       }


        @Override
        public String toString() {
            return firstName + " " + lastName + " " + age + " år," + address + "Tel" + phone + "\n";
        }
    }


