package Aiswaryas;

import java.text.SimpleDateFormat;
import java.util.*;

public class HW11 {

    public static void main(String[] args) {
        generateTimeLine(5);
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey", "green", "red", "blue"};
        display(arr);
    }

    public static void generateTimeLine(int num) {
        {
            Calendar myCalendar = Calendar.getInstance();
            Date myDate = myCalendar.getTime();
            SimpleDateFormat df = new SimpleDateFormat("Ka");
            String myTime = df.format(myDate);

            for (int i = 0; i < num; i++) {
                myCalendar.add(Calendar.HOUR, 2);
                SimpleDateFormat sdf = new SimpleDateFormat("Ka");
                Date date = myCalendar.getTime();
                String after2hrs = sdf.format(date);
                System.out.print(after2hrs + " ");
            }
            System.out.println(" ");
        }
    }

    public static void display(String[] ab) {
        int red = 0;
        int green = 0;
        int yellow = 0;
        int blue = 0;
        int grey = 0;
        List<String> al;
        al = Arrays.asList(ab);
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (String s : al) {
            if (s.equalsIgnoreCase("red")) {
                red++;
            }
            if (s.equalsIgnoreCase("green")) {
                green++;
            }
            if (s.equalsIgnoreCase("blue")) {
                blue++;
            }
            if (s.equalsIgnoreCase("grey")) {
                grey++;
            }
            if (s.equalsIgnoreCase("yellow")) {
                yellow++;
            }
        }
        c.add(red);
        c.add(green);
        c.add(blue);
        c.add(grey);
        c.add(yellow);

        int max = Collections.max(c);
        if (red == max)
            System.out.println("Red");
        if (green == max)
            System.out.println("Green");
        if (blue == max)
            System.out.println("Blue");
        if (grey == max)
            System.out.println("Grey");
        if (yellow == max)
            System.out.println("Yellow");
    }

}

