package Aiswaryas;

public class HomeworkEightMain {
    public static void main(String[] args) {

        HomeworkEightMethods m1 = new HomeworkEightMethods();

        // 1. Array Sum Method
        double[] array ={10.5,20.5,30.5,40.5};
        double result = m1.arraySum(array);
        System.out.println("The sum of the array elements: " + result);

        // 2. Check Prime Method
        m1.checkPrime(44);

         m1.palindrome("racecar");

        // 4. Checking Duplicate in One Array
        String[] students ={"Aiswarya","Mary","Bella", "Aiswarya", "Alexi"};
        m1.duplicateOneArray(students);

        // 5. Checking Duplicate in Two Arrays
        String[] name1 = {"Aiswarya","Naresh","Ramesh","Mathew"};
        String[] name2 = {"Jessica","Aiswarya", "Naresh","Melissa"};
         m1.duplicatesTwoArrays(name1,name2);
    }

}
