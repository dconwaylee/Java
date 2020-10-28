package com.cake;
import com.cake.cake;

public class eatCake {

    public static void main(String[] args) {



        cake Chocolate = new cake("Chocolate", 500, 34);
        System.out.println(Chocolate.describe());
        cake Vanilla = new cake("Vanilla", 241, 24);
        System.out.println(Vanilla.describe());
    }
}
