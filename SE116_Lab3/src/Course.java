import java.util.ArrayList;
public class Course{
    private String courseCode;
    private String courseName;
    //private Student [] enrolledStudents;
    private ArrayList<Student>enrolledlist;
    private int index = 0;
    public Course (String courseCode,String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        //enrolledStudents = new Student[3];
        enrolledlist=new ArrayList<>();


    }

    public void addStudent(Student s){
       /*  if(index>3) {
             enrolledStudents[index] = s;
             index++;
             System.out.println("Student added");

         }else{
             System.out.println("Course full");
        */
        enrolledlist.add(s);
        System.out.println("Student added");


    }
    public void displayEnrolledStudent(){
        for (Student s: enrolledlist){
            s.printInfo();

             }
           }
        }





