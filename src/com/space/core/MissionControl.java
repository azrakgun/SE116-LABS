package com.space.core;
import com.space.exceptions.InsufficientFuelException;
import com.space.exceptions.MissionDataException;
import com.space.mission.MissionTask;
import com.space.exceptions.MissionDataException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;

public class MissionControl {
    private String missionName;
    private ArrayList <SpaceCraft> spaceCrafts;
    private ArrayList <Astronaut> astronauts;

    public MissionControl(String missionName,ArrayList<SpaceCraft> spaceCrafts,ArrayList <Astronaut> astronauts) {
        this.missionName=missionName;
        this.spaceCrafts = new ArrayList<>();
        this.astronauts= new ArrayList<>();
    }
    public void addSpaceCraft(SpaceCraft spaceCraft){
        spaceCrafts.add(spaceCraft);

}
    public void removeSpaceCraft(String craftName){
        boolean isFound = false;
         for(int i=0;i<spaceCrafts.size();i++ ){
             if(spaceCrafts.get(i).getCraftName().equals(craftName)){
                 spaceCrafts.remove(i);
                   isFound = true;
                     break;
             }
        }
         if (!isFound){
             System.out.println("Error");
         }

    }
    public void addAstronaut(Astronaut astronaut){
        astronauts.add(astronaut);

    }
    public void removeAstronaut(String astronautName){
      boolean isFound = false;

      for(int i=0;i<astronauts.size();i++){
          if(astronauts.get(i).getName().equals(astronautName)){
              astronauts.remove(i);
                isFound = true;
                  break;
          }
      }
      if (!isFound){
          System.out.println("Error");
      }
    }
    public void printMissionMembers(){
        System.out.println("Mission: " + missionName );
        System.out.println("Spacecrafts: " + spaceCrafts);
        System.out.println("Astronauts: " + astronauts);
    }

    public Astronaut getAstronaut(String astronautName) {
        for (Astronaut a : astronauts)
            if (a.getName().equals(astronautName)) {
                return a;
            }
        return null;
    }

    public SpaceCraft getSpacecraft(String craftName){
            for(SpaceCraft sc:spaceCrafts)
                if(sc.getCraftName().equals(craftName)){
                return sc;
        }
        return null;
    }
    public void launchTask(String craftName, String astronautName, MissionTask task) throws MissionDataException {
        SpaceCraft selectedCraft = getSpacecraft(craftName);
        Astronaut selectedAstronaut = getAstronaut(astronautName);

        try {
            selectedCraft.executeTask(task);
            selectedAstronaut.performTask(task);

        }
        catch (InsufficientFuelException e){
            throw new MissionDataException("Task failed due to insufficient fuel " ,e);
        }

        catch (NullPointerException e){
            throw new  MissionDataException("Task failed because spacecraft or astronaut is missing." ,e);
        }
        catch (RuntimeException e){
            throw new MissionDataException("Task failed due to runtime issue ",e);

    }
        finally {
            System.out.println("Mission control finished. " + task.getName());
          }
        }
        public void exportMissionLog(String logText){
            PrintWriter out = null;
            try {
                out = new PrintWriter(new FileWriter("logs.txt"));
                out.println(logText);
            }catch (IOException e){
                System.out.println("An error occurred whilst writing to the log file: " + e.getMessage());
            }finally {
                if (out!=null){
                    out.close();
                }
            }
        }
}

