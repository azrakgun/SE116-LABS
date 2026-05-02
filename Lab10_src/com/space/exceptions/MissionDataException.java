package com.space.exceptions;



public class MissionDataException extends Exception{
    public MissionDataException(String message) {
        super(message);
    }
    public MissionDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
