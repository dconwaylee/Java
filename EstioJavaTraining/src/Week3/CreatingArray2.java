package Week3;

import java.lang.reflect.Member;

public class CreatingArray2 {



   public static void main(String[] args) {
      String[] names = {"Shelly"};
      System.out.println(names[0]);
      Object[] objects = names;
      String[] namesAgain = (String[]) objects;
      objects[0] = "Adam";
      System.out.println(names[0]);

      Member[] members = new Member[3];
      //members[0] = new Member("Will");
      //members[1] = new Member("James");
      //members[2] = new Member("Domonic");
      System.out.println(members[0]);

      //new member class
      //array of three
   }



   class Member {
      private String membersName;

      public Member(String membersName) {
         this.membersName = membersName;
      }

      public String getMembersName() {
         return membersName;
      }
   }
}