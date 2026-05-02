package com.space.core;
import com.space.exceptions.MissionDataException;
import com.space.mission.MissionTask;
import java.util.ArrayList;

public class MissionTest {
    public static void main(String[] args) {
        SpaceCraft sc1 = new SpaceCraft("X",100);
        SpaceCraft sc2 = new SpaceCraft("V",75);
        SpaceCraft spareVehicle = new SpaceCraft("Spare vehicle", 50);

        Astronaut a1 = new Astronaut("Armstrong",15);
        Astronaut a2 = new Astronaut("Astronaut",1);

        ArrayList <SpaceCraft> fleet = new ArrayList<>();
        fleet.add(sc1);
        fleet.add(sc2);

        ArrayList <Astronaut> crew = new ArrayList<>();
        crew.add(a1);
        crew.add(a2);

        MissionControl controlCenter = new MissionControl("Mission",fleet,crew);
        MissionTask task1 = new MissionTask("Orbiting",25,2);
        MissionTask task2 = new MissionTask("Moon Landing",60,1);
        MissionTask task3 = new MissionTask("Deep Space Exploration",125,6);

        controlCenter.addSpaceCraft(sc1);
        controlCenter.addSpaceCraft(sc2);
        controlCenter.addSpaceCraft(spareVehicle);
        controlCenter.addAstronaut(a1);
        controlCenter.addAstronaut(a2);

        controlCenter.printMissionMembers();

        controlCenter.removeSpaceCraft("Spare vehicle");
        controlCenter.printMissionMembers();

        try{
            controlCenter.launchTask("X","Astronaut",task2);
        }catch (MissionDataException e){
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
        try {
            controlCenter.launchTask("V","Armstrong",task3);
        }catch (MissionDataException e){
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
        try {
            controlCenter.launchTask("V","Invalid Astronaut",task3);
        }catch (MissionDataException e){
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getCause());

        }
        try {
            controlCenter.launchTask("X","Astronaut",task1);
        }catch (MissionDataException e){
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getCause());

        }
        controlCenter.exportMissionLog("The system tests have been successfully completed");
        controlCenter.exportMissionLog("A log file has been created ");

        int oldExp = a1.getExperienceLevel();
        try {
            controlCenter.launchTask("X","Armstrong",task1);
            assert sc1.getFuelLevel() >= 0 :"ERROR: The fuel level has dropped below the minimum! ";
            assert task1.isCompleted() == true :"ERROR: Task has not been marked as completed! ";
            assert a1.getExperienceLevel() >oldExp:"ERROR: Astronaut experience did not increase!";
            System.out.println("Mission Completed...");
        }catch (MissionDataException e){
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getMessage());
        }
    }
}

