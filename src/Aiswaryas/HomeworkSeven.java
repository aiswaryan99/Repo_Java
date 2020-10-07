package Aiswaryas;

public class HomeworkSeven {
    private static int avg;

    public static void main(String[] args) {

        // 1. Average of Array Elements

        int num[] = {10, 20, 30};
        double res = arrayAvg(num);
        System.out.println("The Average of the array elements: " + res);
        int ret = search("philip");
    }

    public static double arrayAvg(int[] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (sum / arr.length);
    }

    // 2. Print the index of array if name is present if not return value -1
    public static int search(String nameToSearch) {
        int res = -1;
        String names[] = {"John", "michael", "gphilipppre", "philip", "ilena", "palena", "fahry"};
        // search();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(nameToSearch)) {
                System.out.println("The Index the name is present is " + i);
                res = i;
                break;
            }
        }
        if (res == -1)
            System.out.println("Name " + nameToSearch + " not found in the list!");

        return res;
    }
}