public class Student {
    private String id;
    private String name;
    private double grade;
    private double performanceGrade;

    public Student(String id,String name,int grade,double performanceGrade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.performanceGrade=performanceGrade;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGrade(){
        return grade;
    }
    public double getPerformanceGrade(){
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Performance Grade: " + performanceGrade);
    }

}