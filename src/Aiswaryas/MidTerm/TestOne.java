package Aiswaryas.MidTerm;

import java.util.Arrays;

public class TestOne {

    // 1. Method to remove the number from an array and display
    public int[] removeInt(int[] numbers, int num) {
        int[] copy = new int[numbers.length];
        int countRemoved = 0;
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != num) {
                copy[j++] = numbers[i];
            } else
                countRemoved++;
        }
        int[] newCopy = new int[numbers.length - countRemoved ];
        for (int i = 0; i < newCopy.length; i++)
            newCopy[i] = copy[i];

        return newCopy;
    }

    // 2. Return missing smallest positive integer
    public int findMissingNo(int[] array) {

        // Sorting the array in ascending order
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j])
                    minIndex= j;
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex]  = tmp;
        }
        //System.out.println(Arrays.toString(array));

        int minMissingVal = 1;
        for (int i = 0; i < n; i++) {
            if (array[i] == minMissingVal)
                minMissingVal++;
            else if (array[i] > minMissingVal)
                break;
        }
        return minMissingVal;

    }

    //3. Traffic Ticketing System
    public void points(int speed) {
        int limit = 70;
        int p = 0;
        if (speed <= 70) {
            System.out.println("Thank you for driving within the speed limit. ");
        } else if (speed > limit) {
            p  = (speed - limit) / 5;
        }
        System.out.println(p + " points !");

        if(p >= 12) {
            System.out.println("Licence is Suspended !!!");
        }
    }
}

