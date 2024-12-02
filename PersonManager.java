import java.util.ArrayList;

public class PersonManager{
    private ArrayList<Persons> personList;

    public PersonManager(){
        personList = new ArrayList<>();
    }
    public void addPerson(Persons person){
        personList.add(person);
    }
    public ArrayList<Persons> getPersons(){
        return personList;
    }
}