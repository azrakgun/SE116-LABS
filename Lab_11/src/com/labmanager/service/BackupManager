package com.labmanager.service;
import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.*;

public class BackupManager {
    public static boolean fileExists(Path path){
        return Files.exists(path);
    }
    public static void copyInputFile(Path sourcePath, Path destinationPath){
try {
    Files.copy(sourcePath,destinationPath,StandardCopyOption.REPLACE_EXISTING);

}catch (IOException e){
    System.out.println("File copy error" + e.getMessage());
}
    }
    public static long getFileSize(Path path){
        try {
            return Files.size(path);
        }
        catch(IOException e){
            return 0;
        }
    }
 public static void appendLog(Path logPath, String message){
       try{
           Files.writeString(logPath,message + System.lineSeparator(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
       }catch (IOException e){
           System.out.println("Log Error: " + e.getMessage());
       }
 }

}
