public class StudentManager{



   public double applyGradeOperation(Student s, GradeOperation operation){
          return operation.apply(s.getGrade());

    }
    //öğrenciden notu al -> s.getGrade() , lambdaya ver operation.apply(...), sonucu döndür


    boolean checkStudent(Student s, StudentChecker checker){
      return checker.check(s);
    }
}
//öğrenciyi al , lambdaya ver checker.check(s), true false döndür
//StudentManager sm = new StudentManager();
