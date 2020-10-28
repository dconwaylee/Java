package com.cake;

public class ScopeTask {
    public static void isHungry(boolean isHungry) {
        boolean bellyRumble;

        if (isHungry) {
            bellyRumble = true;
            System.out.println("Your belly is rumbling");
        } else {
            bellyRumble = false;
            System.out.println("You've had enough to eat");
        }
    }



    public static void main(String[] args) {

        isHungry(false);
        //Use this to test if we are hungry
        //you can only have 1 return statement
    }
}
