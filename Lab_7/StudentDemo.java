import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> stdList = new ArrayList<>();

        stdList.add(new Student("123", "Ali", 100, 100));
        stdList.add(new Student("345", "Cem", 90, 80));
        stdList.add(new Student("567", "Can", 80, 70));
        stdList.add(new Student("789", "Veli", 30, 50));

        StudentManager sm = new StudentManager();

        int bonusThreshold = 75;
        for (Student s : stdList) {
            s.displayInfo();
            //30-40
            if (sm.checkStudent(s, st -> st.getGrade() >= 30.0 && st.getGrade() <= 40.0)) {
                s.setGrade(sm.applyGradeOperation(s, grade -> 40.0));
            }
            //85-90
            //performanceGrade >= bonusThreshold
            if (sm.checkStudent(s, st -> st.getGrade() > 85.0 && st.getGrade() < 90.0)) {
                s.setGrade(sm.applyGradeOperation(s, grade -> 90.0));
            }
            if (sm.checkStudent(s, st -> st.getPerformanceGrade() > bonusThreshold)) {
                s.setGrade(sm.applyGradeOperation(s, grade -> grade + 5.0));

            }

            System.out.println("Normalized grade: " + s.getGrade());

            System.out.println("Final grade: " + s.getGrade());
            if (sm.checkStudent(s, st -> st.getGrade() >= 60.0)) {
                System.out.println("You will pass the exam... ");
            } else {
                System.out.println("Failed...");
            }

        }

        System.out.println("\nSorted by grade: ");
        Collections.sort(stdList,(s1,s2) -> Double.compare(s1.getGrade(), s2.getGrade()));
         for(Student s: stdList){
             System.out.println(s.getName() + " - " + s.getGrade());
         }
         System.out.println();
         Collections.sort(stdList,(s1,s2) -> s1.getName().compareTo(s2.getName())) ;

         System.out.println("Sorted by name (Alphabetical) ");

         for(Student s: stdList){
             System.out.println(s.getName() + " - " + s.getGrade());
         }
    }
}









