package com.labmanager.service;
import com.labmanager.model.StudentRecord;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;
import static java.nio.file.Files.newBufferedWriter;

public class RecordManager {
    public static ArrayList<StudentRecord> readRecords(Path inputPath) {
        ArrayList<StudentRecord> records = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(inputPath)) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 5) {
                    System.out.println("Warning: Missing fields. Skipping line...");
                    continue;
                }
                try {
                    int labs = Integer.parseInt(parts[2]);
                    double avgScore = Double.parseDouble(parts[3]);

                    StudentRecord student = new StudentRecord(parts[0], parts[1], labs, avgScore, parts[4]);
                    records.add(student);
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Invalid numerical value");
                }

            }
        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
        return records;
    }

    public static void writeSuccessfulReport(ArrayList<StudentRecord> records, Path reportPath) {
        try (BufferedWriter bw = Files.newBufferedWriter(reportPath)) {
            bw.write(" === Successful Students === \n");
            for (StudentRecord student : records) {
                if (student.isSuccessful()) {
                    bw.write(student.getInfo() + "\n");
                }
            }


        } catch (IOException e) {
            System.out.println("File error");
        }

    }
    public static void writeSummaryReport(ArrayList<StudentRecord> records, Path summaryPath){
        int totalStudents = records.size();
        int successfulCount=0;
        int unsuccessfulCount=0;
        double totalScore =0.0;
        for (StudentRecord student:records){
            if(student.isSuccessful()){
                successfulCount ++;
            }else{
                unsuccessfulCount ++;
            }
            totalScore +=student.getAverageScore();
        }
        double classAvg = totalScore / totalStudents;
        try(BufferedWriter bw =Files.newBufferedWriter(summaryPath)) {
            bw.write("=== CLASS SUMMARY === \n");
            bw.write("Total Student: " + totalStudents + "\n");
            bw.write("Successful Students: " + successfulCount + "\n");
            bw.write("Unsuccessful Students: " + unsuccessfulCount + "\n");
            bw.write("Class Average Score: " + classAvg + "\n");


        }catch (IOException e){
            System.out.println("File error ");
        }
    }
    public static void serializeRecords(ArrayList<StudentRecord> records, Path backupPath){
     try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(backupPath))){
         oos.writeObject(records);

     }catch (IOException e){
         System.out.println("Serialization error");
      }
    }

    public static ArrayList<StudentRecord> deserializeRecords(Path backupPath){
        ArrayList <StudentRecord> records = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(backupPath))){
            records = (ArrayList<StudentRecord>) ois.readObject();


        }catch (IOException | ClassNotFoundException e){
            System.out.println("Deserialization error: " + e);

        }
        return records;
   }
}


