
public class Student{
   private String name;
   private String studentID;
   private double gpa;

   public Student (String name,String studentID,double gpa){
       this.studentID=studentID;
       this.gpa=gpa;
       this.name=name;
   }
   public String getStudentID (String studentID){
       return studentID;

   }
   public void setStudentID (String studentID){
       this.studentID=studentID;
   }
   public String getName(String name){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public double getGpa(double gpa){
       return gpa;
   }
   public void setGpa(double gpa){
       this.gpa=gpa;
   }
  public void printInfo(){
       System.out.println("Student Name : " + name);
       System.out.println("Student ID : " + studentID);
       System.out.println("GPA: " + gpa);
  }
    public class EnrollmentDemo{
       public static void main (String []  args){
           Student s1 = new Student("A","20240567",3.27);
           Student s2 = new Student("B","20456755",3.18);
           Student s3 = new Student ("C","2056842",2.47);


           s1.printInfo();
           s2.printInfo();
           s3.printInfo();


        }

     }

  }




