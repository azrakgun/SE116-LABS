package com.space.exceptions;
import com.space.exceptions.InsufficientFuelException;
import com.space.mission.MissionTask;

public class InsufficientFuelException extends Exception {
    public InsufficientFuelException() {
        super("Not enough fuel for the mission task");
    }
}
