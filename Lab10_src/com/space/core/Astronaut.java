package com.space.core;

import com.space.mission.MissionTask;

public class Astronaut {
     private String name;
     private int experienceLevel;

    public Astronaut(String name,int experienceLevel) {
        this.name = name;
        this.experienceLevel=experienceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
    @Override
    public String toString(){
        return "Name: " + name + "Experience level: " + experienceLevel;
    }
    public void performTask(MissionTask task) {
        System.out.println("Astronaut is attempting.");
        if (experienceLevel >= task.getRequiredExperience()) {
            System.out.println("Successful");
            task.setCompleted(true);
            experienceLevel++;
        } else {
            throw new RuntimeException("Astronaut" + name + " does not have enough experience");
        }
    }
}

