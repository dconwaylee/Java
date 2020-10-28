package com.oop;

public class BinaryOp {

    public static void main(String[] args) {

        int p = 5;
        int z = 2 * (5 * (5 * 2) + 2 + (5 - ++p));
        System.out.println(z);

        boolean y = false;

        System.out.println(y);
        y = !y;
        System.out.println(y);

        double x = 1.21;
        System.out.println(x); // 1.21

        x = -x;
        System.out.println(x); // -1.21

        x = -x;
        System.out.println(x); // 1.21

        int myShiftInt = 8 << 2;
        System.out.println(myShiftInt);

        int myShiftSmall = 1 >> 4;
        System.out.println(myShiftSmall);

        int myShiftBig = 256 << 4;
        System.out.println(myShiftBig);

        byte newByte = (byte) 129;
        System.out.println(newByte);

        byte xx = (byte) 258;
        System.out.println(xx);

        byte xq = (byte) 130;
        System.out.println(xq);

        String name1 = "Domonic";
        String name2 = "Conway-Lee";

        System.out.println(name1 instanceof String);
        System.out.println(name2 instanceof String);

        Integer w = 10;
        if (w != null && w.intValue() < 5) {
            System.out.println("w is not null and less than 5");
        } else {
            System.out.println("w is either null > 4");
        }

        int ageOfPerson = 90;

        if (ageOfPerson < 18) {
            System.out.println("Under Age. Enjoy a lemondae!");
        } else if (ageOfPerson >= 90){
            System.out.println("Lay of the liqour boomer");
        }
    else{
            System.out.println("Don't get to wrecked! Be responsible");
        }
    }
}
