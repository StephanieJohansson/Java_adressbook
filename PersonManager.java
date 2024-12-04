import java.util.ArrayList;

public class PersonManager{

    // instance variable arraylist to store value of the Person-object
    private ArrayList<Persons> personList;

    // constructor to create an arraylist to use in main as the preset list of profiles
    public PersonManager(){
        personList = new ArrayList<>();
    }

    // method that put the profiles in my arraylist
    public void addPerson(Persons person){
        personList.add(person);
    }

    // method to return the whole list of profiles
    public ArrayList<Persons> getPersons() {
        return personList;
    }

    //"Query" is used to extract data from the database
    //Searching for contacts that match in any field
    public ArrayList<Persons> search(String query) {
        ArrayList<Persons> results = new ArrayList<>(); //Store matching contacts

        //Loop searching for data in the database to match the input
        for (Persons person : personList) {
            if (person.getFirstName().toLowerCase().contains(query.toLowerCase()) ||
                    person.getLastName().toLowerCase().contains(query.toLowerCase()) ||
                    person.getAddress().toLowerCase().contains(query.toLowerCase()) ||
                    person.getPhone().contains(query)) {
                results.add(person); //Add matching person to results
            }
        }
        return results; //Return list of persons that match the input
    }
}