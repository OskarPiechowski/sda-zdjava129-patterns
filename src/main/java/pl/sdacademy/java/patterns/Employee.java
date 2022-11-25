package pl.sdacademy.java.patterns;

public class Employee implements HasPerson{
    private Person person;
    private int salary;
    private int employmentDate;

    public Employee(Person person, Subject subject) {

    }

    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }

    public Employee(Person person, int salary, int employmentDate) {
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
