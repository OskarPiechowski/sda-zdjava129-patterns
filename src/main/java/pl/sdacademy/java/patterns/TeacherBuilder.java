package pl.sdacademy.java.patterns;

public class TeacherBuilder extends EmployeeBuilder {

    private Person person;
    private Subject subjectCode;

    public TeacherBuilder person(Person person){
        this.person = person;
        return this;
    }

    public TeacherBuilder subjectCode(Subject subjectCode) {
        this.subjectCode = subjectCode;
        return this;
    }

    public Teacher build(){
        return new Teacher(person, subjectCode);
    }

}
