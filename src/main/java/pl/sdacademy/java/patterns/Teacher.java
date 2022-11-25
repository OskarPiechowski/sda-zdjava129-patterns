package pl.sdacademy.java.patterns;

class Teacher extends Employee implements HasPerson {

   private Person person;
   private Subject subjectCodes;

   public static TeacherBuilder builder(){
      return new TeacherBuilder();
   }

   public Teacher(Person person, int salary, int employmentDate) {
      super(person, salary, employmentDate);
   }

   public Teacher(Person person, Subject subjectCodes) {
      super(person, subjectCodes);
   }



   @Override
   public Person getPerson() {
      return person;
   }

   public Subject getSubjectCodes() {
      return subjectCodes;
   }

}
