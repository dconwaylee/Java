package com.cake;

public class cake {

    private String Flavour;
    private int Calories;
    private int PrepTime;
    private boolean ShareCake;

    public cake(String flavour, int calories, int prepTime) {

        this.Flavour = flavour;
        this.Calories = calories;
        this.PrepTime = prepTime;
    }

    public cake(String flavour, int calories, int prepTime, boolean shareCake) {
        this.Flavour = flavour;
        this.Calories = calories;
        this.PrepTime = prepTime;
        this.ShareCake = shareCake;
    }

    public String describe() {
        return "This is a " + Flavour + " cake, it takes " + PrepTime + " to prepare & is " + Calories + " calories.";
    }
}
