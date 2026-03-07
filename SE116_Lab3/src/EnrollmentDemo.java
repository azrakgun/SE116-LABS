import java.util.Collections;
public class EnrollmentDemo {
    public static void main (String [] args){
        Student s1 = new Student("X","2014648",2.45);
        Student s2 = new Student("Y","2482141",3.00);
        Student s3 = new Student("Z","2014648",1.98);
        Student s4 = new Student("Q","2058948",3.44);
        Student s5 = new Student("A","2058751",3.85);
        Student s6 = new Student("B","2058456",3.95);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        Course course = new Course("SE 116","Intro to Programming II");
        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s3);
        course.addStudent(s4);
        course.addStudent(s5);
        course.addStudent(s6);

        System.out.println("All Student: ");

        course.displayEnrolledStudent();
        System.out.println("Removed: ");



    }
}
