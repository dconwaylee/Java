package com.oop;

import jdk.dynalink.beans.MissingMemberHandlerFactory;

public class StaticTest {

    public static void main(String[] args) {


        Member member4 = Member.makeMember("James");
        Member member5 = Member.makeMember("Marcy");
        Member member6 = Member.makeMember("Bob");
        Member member7 = Member.makeMember("Jim");

        System.out.println(Member.numberOfMembers);

    }
}
