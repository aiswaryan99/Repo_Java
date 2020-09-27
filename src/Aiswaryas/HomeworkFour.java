package Aiswaryas;

import java.util.Arrays;

public class HomeworkFour {
    public static void main(String[] args) {

        // 1. Store your full name in a variable and display the following.
            String Name= "Aiswarya Nair";

            // a. Display length of the first name
            String[] fullName= Name.split(" ");
            String first= fullName[0];
            int firstNameLen= first.length();
            System.out.println("The length of the first name is: " + firstNameLen);

            // b. Does your last name start with 'k' (Ignore Cases)
            String last= fullName[1];
            boolean nameStartsWithK= last.startsWith("k");
            System.out.println("Does the last name start with 'k' : " + nameStartsWithK);

            // c. Print the last alphabet of your first name
            char lastLetter= last.charAt(last.length()-1);
            System.out.println("The last alphabet in the last name is : " + lastLetter);

            // d. Does your last name end with 'M' (Ignore Cases)
            boolean nameEndsWithM= last.endsWith("M");
            System.out.println("Does the last name end with 'M' : " + nameEndsWithM);

            // 2. Using the below string to answer the following
                String myStatement= "I am a good programmer.";

                // a. Display the total number of words in the myStatement
                    System.out.println(myStatement);
                    String[] statement = myStatement.split(" ");
                    int len= statement.length;
                    System.out.println("There are " + len + " words in the above statement.");

                //b. Replace all the 'r' characters with 'f' characters
                    String myStatementReplace= myStatement.replace('r','f');
                    System.out.println("After replacing the r's with f's, the result is: " + myStatementReplace);

            // 3. Calculate the length of your name without using length() method of String Class
                    System.out.println("Length of my Name is: " + Name.toCharArray().length);


            // 4. Assign result (boolean) as true if length of strNew if greater than 10 else assign false then print result value
                    String strNew= "hello dear,how are you?";
                    int strNewLen= strNew.length();
                    boolean result= strNewLen > 10;
                    System.out.println("The length of the string is greater than 10 ? "+ result);

            // 5. Input= "hApPY nEW yeAr" to Output= Happy New Year
            // 6. Create Abbreviation- Output: HNY

                    String threeWordSentence="hApPy nEW yeAr";
                    String wordsInLowerCase=threeWordSentence.toLowerCase();
                    String[] words=wordsInLowerCase.split( " ");
                    System.out.println(Arrays.toString(words));

                    char [] wordArray = words[0].toCharArray();
                    wordArray[0] = Character.toUpperCase(wordArray[0]);
                    words[0] = new String(wordArray);

                    String abbrev = Character.toString(wordArray[0]);

                    wordArray = words[1].toCharArray();
                    wordArray[0] = Character.toUpperCase(wordArray[0]);
                    words[1] = new String(wordArray);
                    abbrev = abbrev + Character.toString(wordArray[0]);

                    wordArray = words[2].toCharArray();
                    wordArray[0] = Character.toUpperCase(wordArray[0]);
                    words[2] = new String(wordArray);
                    abbrev = abbrev + Character.toString(wordArray[0]);

                    System.out.println(words[0] + " " + words[1] + " " + words[2]);
                    System.out.println("The abbreviated letters are: " + abbrev);

    }
}
