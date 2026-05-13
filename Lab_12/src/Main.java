import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
   public static void main(String[]args) {

       ArrayList<String> rawName = new ArrayList<>();
       ArrayList<String> lines= new ArrayList<>();

      try( BufferedReader br = new BufferedReader(new FileReader("data.csv"))){
          String line;
          br.readLine();
          while((line=br.readLine()) != null){
              System.out.println(line);
              String[] elements = line.split(",");
              String trimmed = elements[1].trim();
              System.out.println(trimmed);
              String upCase = trimmed.toUpperCase();
              System.out.println(upCase);
              String noSpace = upCase.replace("  ",
               " ");
              System.out.println(noSpace);

                  }

          } catch (IOException e) {
           System.out.println("File error " + e.getMessage());
      }

   }
   }
