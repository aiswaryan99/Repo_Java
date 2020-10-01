package Aiswaryas;

import javax.sound.midi.Soundbank;

public class HomeworkFive {
    public static void main(String[] args) {

        // 1. Student Grade and Percentage

        char grade;
         int studentScore=86;
         int maxScore=100;
         int percentage=(studentScore * 100/maxScore);

         // 91 >= percentage >= 100
         if (percentage >= 91 && percentage <= 100) {
             grade = 'A';
         } else if (percentage >= 81 && percentage <= 90) {
             grade = 'B';
         } else if (percentage >= 71 && percentage <= 80) {
             grade = 'C';
         } else if (percentage >= 61 && percentage <= 70) {
             grade = 'D';
         } else if (percentage >= 51 && percentage <= 60) {
             grade = 'E';
         } else {
             grade ='F';
         }
        System.out.println("Percentage is "+ percentage+ "% and Grade is " + grade);


       // 2. Divisible Question

        int num=20;

        if (num%3==0){
            System.out.println( num + " is divisible by 3.");
        } else if (num%5==0){
            System.out.println( num + " is divisible by 5.");
        } else if (num%3==0 && num%5==0) {
            System.out.println(num + " is divisible by 3 and 5.");
        } else {
            System.out.println(num);
        }

        //3. Checking Car Mode

        char gear= 'R';
        String cMode= "Snow";

        switch (gear) {
            case ('P'):
                System.out.println("You can park car");
                break;
            case ('D'):
                if (cMode == "Snow") {
                    System.out.println("You are on Snow Mode");
                } else if (cMode == "Sport") {
                    System.out.println("You are on Sport Mode");
                } else if (cMode == "Eco"){
                    System.out.println("You are on Eco Mode");
                } else {
                    System.out.println("Invalid Mode");
                }
                break;
            case ('N'):
                System.out.println("Put car in car wash");
                break;
            case ('R'):
                System.out.println("You can reverse the car");
                break;
            default:
                System.out.println("Invalid Gear mode");
                break;
        }
    }
}
