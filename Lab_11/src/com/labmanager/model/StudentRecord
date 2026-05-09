package com.labmanager.model;

import java.io.Serializable;

public class StudentRecord implements Serializable {
    private static final long serialVersionUID=1L;
    private String studentId;
    private String name;
    private int completedLabs;
    private double averageScore;
    private transient String temporaryPassword;

    public StudentRecord(String studentId,String name,int completedLabs,double averageScore,String temporaryPassword){
        this.studentId=studentId;
        this.name=name;
        this.completedLabs=completedLabs;
        this.averageScore=averageScore;
        this.temporaryPassword=temporaryPassword;

    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCompletedLabs(int completedLabs) {
        this.completedLabs = completedLabs;
    }

    public int getCompletedLabs() {
        return completedLabs;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setTemporaryPassword(String temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
    }

    public String getTemporaryPassword() {
        return temporaryPassword;
    }

    public boolean isSuccessful(){
        return completedLabs >=7 && averageScore >=60.0;

    }
    public String getInfo(){
        return studentId + " - " + name + " - Labs: " + completedLabs + " - Average: " + averageScore + " Temporary Password: " + temporaryPassword + ", ";
    }
}
