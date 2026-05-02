/*If grade equal or greater than 60,
the student become successful.
But the grade less than 60 student should be fail.
DD is acceptable.
*/

import java.util.ArrayList;
 public class GradeEstimator{

     public static final int  AA_MIN = 90;
     public static final int  BA_MIN = 85;
     public static final int  BB_MIN = 80;
     public static final int  CB_MIN = 75;
     public static final int  CC_MIN = 70;
     public static final int  DC_MIN = 65;
     public static final int  DD_MIN = 60;
     public static final int  FD_MIN = 50;
     public static final int MIN_VALID_SCORE = 0;
     public static final int MAX_VALID_SCORE = 100;

     public static final double AA_COEFFICIENT=4.00;
     public static final double BA_COEFFICIENT=3.50;
     public static final double BB_COEFFICIENT=3.00;
     public static final double CB_COEFFICIENT=2.50;
     public static final double CC_COEFFICIENT=2.00;
     public static final double DC_COEFFICIENT=1.50;
     public static final double DD_COEFFICIENT=1.00;
     public static final double FD_COEFFICIENT=0.50;


     //TASK 8
     public static int calculateTotalEcts( ArrayList<Course>courses){
         int total =0;

         for(int i =0; i<courses.size();i++){
             Course currentCourse = courses.get(i);
             int credit = currentCourse.getEcts();

             total += credit;
         }
         return total;
     }

     //TASK 8
     public static void printTranscript(ArrayList <Course>courses){
         System.out.println("----------------------------------" + "\n        SEMESTER TRANSCRİPT         " + "\n----------------------------------");
         System.out.printf("%-10s %-8s %-8s %-5s\n","Course","Score","Letter","ECTS");
         for(int i=0;i<courses.size();i++){

             Course currentCourse = courses.get(i);
             System.out.printf("%-10s %-8d %-8s %-5d\n",currentCourse.getName(),currentCourse.getScore(),currentCourse.getLetter(),currentCourse.getEcts());

         }

         double gpa =avgScore(courses);
         int passed = passedCount(courses);
         int totalEcts = calculateTotalEcts(courses);
         System.out.println("----------------------------------");
         System.out.printf("GPA: %.2f     Passed: %d      Total ECTS: %d\n", gpa, passed, totalEcts);

         System.out.println("Standing: " + getAcademicStanding(gpa));
     }

     //TASK 9
     public static String getAcademicStanding(double gpa){
         if(gpa <0){
             return "N/A (No valid courses)";
         }
         else if(gpa >= 3.50){
             return "High Honour";
         }
        else if(gpa >= 3.00){
             return "Honour";
         }
        else if(gpa >= 2.00){
             return "Satisfactory";
         }
         else{
             return "Academic Probation";
         }

     }



 public static String grade(int score){
         if(score<0 || score>100) return "INVALID";

         if(score >= AA_MIN){
             return "AA";
         }
         else if(score >= BA_MIN){
             return "BA";
         }
         else if(score >=BB_MIN){
             return "BB";
         }
         else if(score >=CB_MIN){
             return "CB";
         }
         else if(score >=CC_MIN){
             return "CC";
         }
         else if(score >=DC_MIN){
             return "DC";
         }
         else if(score >=DD_MIN){
             return "DD";
         }
         else if(score >=FD_MIN){
             return "FD";
         }
         else{
             return "FF";
         }
     }
     public static double coefficient(String letter){


         if (letter.equals("AA")) return AA_COEFFICIENT;
         if (letter.equals("BA")) return BA_COEFFICIENT;
         if (letter.equals("BB")) return BB_COEFFICIENT;
         if (letter.equals("CB")) return CB_COEFFICIENT;
         if (letter.equals("CC")) return CC_COEFFICIENT;
         if (letter.equals("DC")) return DC_COEFFICIENT;
         if (letter.equals("DD")) return DD_COEFFICIENT;
         if (letter.equals("FD")) return FD_COEFFICIENT;
          return -1;

     }
   //  public static double avgScore(ArrayList<Integer> grades, ArrayList<Integer> ects) {
   public static double avgScore(ArrayList<Course> courses) {

     double total = 0;
         int totalCredits = 0;

      /*   for (int i = 0; i < grades.size(); i++) {
             String letter = grade(grades.get(i));
             double coefficient = coefficient(letter);
             total = total + coefficient * ects.get(i);
             totalCredits = totalCredits + ects.get(i);
         }
*/
       for (int i = 0; i < courses.size(); i++) {
           Course currentCourse = courses.get(i);

           double coefficient =currentCourse.getCoefficient();
           int credit = currentCourse.getEcts();

           total = total + coefficient * credit;
           totalCredits = totalCredits + credit;
       }

         return total / totalCredits;
     }

/*
     public static int passedCount(ArrayList<Integer> grades) {
         int count = 0;
         for (int i = 0; i < grades.size(); i++) {
             if (grades.get(i) >= DD_MIN) {
                 count++;
             }
         }
         return count;
     }
*/
public static int passedCount(ArrayList<Course> courses) {
    int count=0;
    for(int i=0;i < courses.size();i++){
        Course currentCourse = courses.get(i);
        if(currentCourse.getScore() >=60){
           count++;
        }
    }
    return count;

}




     public static void main (String [] args){
         /* ArrayList<Integer> grades = new ArrayList<>();
         ArrayList<Integer> ects = new ArrayList<>(); */

         ArrayList <Course>courses = new ArrayList<>();

      //   grades.add(90); ects.add(5);
         courses.add(new Course("SE116" ,90,6));
         courses.add(new Course("SE226" ,70,6));

         System.out.println("GPA: " + avgScore(courses));
         System.out.println("Passed Count: " + passedCount(courses));

         System.out.println("Letter of 120: " + grade(120));
         System.out.println("Letter of -5: " + grade(-5));
         System.out.println(grade(89));
         System.out.println(grade(90));

printTranscript(courses);
     }

}
class Course{
     private String name;
     private int score;
     private int ects;

     public Course(String name,int score,int ects){
         this.name=name;
         this.score=score;
         this.ects=ects;
     }
public void setName(String name){
         this.name=name;
}
public String getName(){
         return name;}

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getEcts() {
        return ects;
    }

    public boolean isValid(){
         if(score>= 0 && score<=100 && ects>0){
             return true;
         }
         else{
             return false;
         }
    }
    public String getLetter(){
         return GradeEstimator.grade(score);
    }
    public double getCoefficient(){
         return GradeEstimator.coefficient(getLetter());
    }
    @Override
    public String toString(){
         return name + ": " + score + " , " + getLetter() + ects + " ECTS ";
    }

}