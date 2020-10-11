package Aiswaryas;

public class HomeworkEightMethods {

    // 1. Method for adding all the numbers in a double array
    public double arraySum(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    // 2. Method to verify the input is prime or not
    public void checkPrime(int num) {
        int flag = 0;

        int m = num / 2;
        if (num == 0 || num == 1) {

            System.out.println(num + " is not prime!");
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime!");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is prime!");
            }
        }
    }

    // 3. Method to find if input string is a palindrome
    public boolean palindrome(String input) {
        String reverse=new String();
        char[] inputArray = input.toCharArray();

        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            if (inputArray[i] != inputArray[n - 1 - i]) {
                System.out.println(input + " string isn't a palindrome!");
                return false;
            }
        }

        System.out.println(input + " string is a palindrome!");

        for (int i = input.length() -1 ; i >= 0; i--) {
            reverse = reverse + Character.toString(inputArray[i]);
        }
        if(input.equalsIgnoreCase(reverse)){
            System.out.println(input + " string is a palindrome!");
        }
        else
            System.out.println(input + " string isn't a palindrome!");

        return true;
    }

    // 4. Method to display the duplicate values in a given string array
    public void duplicateOneArray(String[] input){
        boolean duplicateFound = false;
        for(int i=0;i < input.length ;i++){
            for(int j= i + 1;j < input.length ;j++){
                if(input[i].equalsIgnoreCase(input[j])){
                    System.out.println(input[j]);
                    duplicateFound = true;
                }
            }
        }
    }

    // 5. Method to print the common values between two string arrays
    public void duplicatesTwoArrays(String[] string1,String[] string2){
        for (String val : string1) {
            for (String s : string2) {
                if (val.equalsIgnoreCase(s)) {
                    System.out.println(s);
                }
            }
        }
    }
}