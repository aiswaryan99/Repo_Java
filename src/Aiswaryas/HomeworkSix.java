package Aiswaryas;

import java.util.Arrays;

public class HomeworkSix {
   public static <Char> void main(String[] args) {

        // 1. Return abbreviation for any given string

       String msg = "have a great day to you";
       String wordsInLowerCase = msg.toLowerCase();
       String[] msg2 = wordsInLowerCase.split(" ");
       System.out.println(Arrays.toString(msg2));

       String abbrev = new String();
       for (int i = 0; i < msg2.length; i++) {
           char[] wordArray = msg2[i].toCharArray();
           wordArray[0] = Character.toUpperCase(wordArray[0]);
           msg2[i] = new String(wordArray);
           abbrev = abbrev + Character.toString(wordArray[0]);
       }
       System.out.println("The abbreviated letters are: " + abbrev);

        // 2. Change the string to title case

       System.out.println("Line (Before Modification): " + msg);
       String titleMsg = new String();
      for (int i = 0; i < msg2.length; i++) {
              char[] wordArray = msg2[i].toCharArray();
              msg2[i] = new String(wordArray);
              titleMsg = titleMsg + " " + msg2[i];

      }
      System.out.println("Line (After Modification): " + titleMsg);

        // 3. Reverse a string

       String message= "happy holidays";
        System.out.println("Message : " + message);

        String reverse = new String();
        char[] msgCharArray = message.toCharArray();
        for (int i= msgCharArray.length - 1; i >= 0; i--) {
            reverse = reverse + Character.toString(msgCharArray[i]);
        }
        System.out.println("Message in Reverse : " + reverse);
    }
}
