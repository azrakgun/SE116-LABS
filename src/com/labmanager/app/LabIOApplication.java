package com.labmanager.app;
import com.labmanager.model.StudentRecord;
import com.labmanager.service.BackupManager;
import com.labmanager.service.RecordManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LabIOApplication {
    public static void main (String [] args){
        Path inputPath = Paths.get("data","students.txt");
        Path outputDir = Paths.get("output");
        Path successfulReportPath = Paths.get("output","successful_students.txt");
        Path summaryPath = Paths.get("output", "summary.txt");
        Path textBackupPath = Paths.get("output", "students_backup.txt");
        Path objectBackupPath = Paths.get("output", "student_records.ser");
        Path logPath = Paths.get("output", "log.txt");

        try{
            if(!Files.exists(outputDir)){
                Files.createDirectories(outputDir);
            }
        }     catch(IOException e) {
            System.out.println("Folder error " + e.getMessage());
            return;
        }
        if(!BackupManager.fileExists(inputPath)){
            System.out.println("Input file not found: " + inputPath);
            return;

        }
        BackupManager.appendLog(logPath,"Program startes... ");
        ArrayList <StudentRecord> records = RecordManager.readRecords(inputPath);
        for(StudentRecord s: records){
            System.out.println(s.getInfo()); }
            RecordManager.writeSuccessfulReport(records,successfulReportPath);
            RecordManager.writeSummaryReport(records,summaryPath);
            BackupManager.appendLog(logPath,"Reports created ");
            BackupManager.copyInputFile(inputPath,textBackupPath);
            long size = BackupManager.getFileSize(textBackupPath);
            System.out.println("Folder size: " + size + "byte");
            RecordManager.serializeRecords(records,objectBackupPath);
            ArrayList <StudentRecord>loadRecords = RecordManager.deserializeRecords(objectBackupPath);
            for(StudentRecord s:loadRecords){
                System.out.println(s.getInfo());

            }BackupManager.appendLog(logPath,"Program finished");

        }
    }

