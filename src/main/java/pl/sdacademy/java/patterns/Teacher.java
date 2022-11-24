package pl.sdacademy.java.patterns;

import java.util.Set;

class Teacher extends Employee implements HasPerson {

   private Person person;
   private Set<String> subjectCodes;

   public Teacher(int salary, int employmentDate) {
      super(salary, employmentDate);
   }

   @Override
   public Person getPerson() {
      return person;
   }

   public Set<String> getSubjectCodes() {
      return subjectCodes;
   }
}
