package com.Operators;

public class EnumPractice {

    public enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        Level level = Level.MEDIUM;

        switch(level){
            case HIGH:
                System.out.println("HIGH");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case LOW:
                System.out.println("LOW");
                break;
            default:
                    System.out.println("Unknown variable");
                    break;
        }
    }
}

