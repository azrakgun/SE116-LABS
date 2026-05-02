package com.space.mission;

public class MissionTask {
    private String name;
    private int requiredFuel;
    private int requiredExperience;
    private boolean isCompleted;

    public MissionTask(String name,int requiredFuel,int requiredExperience) {
        this.name = name;
        this.requiredFuel=requiredFuel;
        this.requiredExperience=requiredExperience;
        this.isCompleted=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredFuel() {
        return requiredFuel;
    }

    public void setRequiredFuel(int requiredFuel) {
        this.requiredFuel = requiredFuel;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = isCompleted;
    }
    @Override
    public String toString(){
        return "Name: " + name + "Required Fuel: " + requiredFuel + "Required experience: " + requiredExperience + "Is completed? " + isCompleted;
    }
}
