package pl.sdacademy.java.patterns;

public class EmployeeBuilder {

    private Person person;

    private int salary;

    private int employmentDate;

    public EmployeeBuilder salary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder person(Person person){
        this.person = person;
        return this;
    }

    public EmployeeBuilder localDateTime(int employmentDate) {
        this.employmentDate = employmentDate;
        return this;
    }

    public Employee build(){
        return new Employee(person, salary, employmentDate);
    }
}
