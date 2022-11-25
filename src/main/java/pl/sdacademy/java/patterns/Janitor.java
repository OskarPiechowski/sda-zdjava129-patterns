package pl.sdacademy.java.patterns;

import java.util.Map;
import java.util.Set;

public class Janitor extends Employee implements HasPerson {

    private Person person;

    private Set<String> cleaningSupplies;

    private Map<String, String> cleaningSpaces;

    public Janitor(Person person, int salary, int employmentDate) {
        super(person, salary, employmentDate);
    }

    @Override
    public Person getPerson() {
        return person;
    }

    public Map<String, String>getFloorsToClean(){
        return cleaningSpaces;
    }

    public  Set<String> getCleaningSupplies(){
        return cleaningSupplies;
    }
}
