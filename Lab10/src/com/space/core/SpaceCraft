package com.space.core;
import com.space.exceptions.InsufficientFuelException;
import com.space.mission.MissionTask;

public class SpaceCraft {
    private String craftName;
    private int fuelLevel;

    public SpaceCraft(String craftName,int fuelLevel){
        this.craftName=craftName;
        this.fuelLevel=fuelLevel;

    }

    public void setCraftName(String craftName) {
        this.craftName = craftName;
    }

    public String getCraftName() {
        return craftName;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
    @Override
    public String toString(){
        return "Craft Name: " + craftName + "Fuel level: " + fuelLevel;
    }
    public  void executeTask(MissionTask task) throws InsufficientFuelException{
        if(fuelLevel >= task.getRequiredFuel()){
            System.out.println("Successful");
            fuelLevel --;

        }else{
            throw new InsufficientFuelException();
        }

    }

}
