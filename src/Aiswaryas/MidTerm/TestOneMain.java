package Aiswaryas.MidTerm;

import java.util.Arrays;

public class TestOneMain {
    public static void main(String[] args) {

        TestOne t1 = new TestOne();

        int[] num={32,14,24,98,24,56,148,24,78,24};
        System.out.println("Before Removal: " + Arrays.toString(num));
        int[] afterRemoveNum= t1.removeInt(num,24);
        System.out.println("After Removal: " + Arrays.toString(afterRemoveNum));

        int[] num1={-1, -3, 4, 2};
        int small=t1.findMissingNo(num1);
        System.out.println("The Smallest Positive Integer: " + small);

        t1.points(178);
    }
}
