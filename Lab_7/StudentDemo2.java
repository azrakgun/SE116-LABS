import java.util.ArrayList;
import java.util.HashMap;

public class StudentDemo2 {
    public static void main (String [] args ){

        ArrayList <Student> std = new ArrayList<>();
        std.add(new Student("123","X",45,75));
        std.add(new Student("456","Y",78,80));
        std.add(new Student("789","Z",98,100));
        std.add(new Student("741","Q",59,75));


        StudentManager sm= new StudentManager();
        HashMap <String,GradeOperation> operations = new HashMap<>();
     /*   operations.put("normalize" , normalize);
        operations.put("bonus " bonus);
*/
        GradeOperation normalizeOp = grade -> {
            if(grade >= 30.0 && grade <=40.0) return 40;
            if(grade >= 85.0 && grade <= 90.0) return 90;
            return  grade;
        };
        GradeOperation bonusOp = grade -> grade +5.0;

        // StudentChecker bonusEligibilityChecker = s ->  return false;

    }
}
