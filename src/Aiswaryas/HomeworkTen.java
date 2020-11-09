package Aiswaryas;

import java.util.HashMap;
import java.util.*;


public class HomeworkTen {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        countOfDup(words);
        HashMap<Integer,String> n = new HashMap<>();
        n.put(101,"happy");
        n.put(102,"peace");
        n.put(103,"Happy");
        n.put(104,"learn");
        n.put(105,"PEaCe");
        n.put(106,"HAPPY");
        displayDup(n);
    }
    public static void displayDup(HashMap<Integer, String>  a ) {
        HashMap<String, ArrayList<Integer>> b = new HashMap<>();

        // Attempt 3- Question 2 Final Answer
        for (Map.Entry<Integer, String> entry : a.entrySet()) {
            String s = entry.getValue().toLowerCase();
            ArrayList<Integer> keys = b.get(s);
            if (keys == null)
                keys = new ArrayList<Integer>();
            keys.add(entry.getKey());
            b.put(s, keys);
        }

        boolean nokeysWithSameValue = true;
        for (Map.Entry<String, ArrayList<Integer>> entry : b.entrySet()) {
            if (entry.getValue().size() > 1) {
                nokeysWithSameValue = false;
                System.out.print(entry.getKey() + " with keys --> ");
                for (Integer i : entry.getValue()) {
                    System.out.print(i + ", ");
                }
                System.out.println("");
            }
        }
        if (nokeysWithSameValue) {
            System.out.println("all keys have different values");
        }

        /* Attempt 1
        for (Map.Entry<Integer, String> entry : a.entrySet()) {
            if (b.containsKey(entry.getValue())) {
                b.get(entry.getValue()).add(String.valueOf(entry.getValue()));
            } else {
                List<String> keys = new ArrayList<>();
                keys.add(entry.getValue());
                b.put(entry.getValue(), keys);
            }
        }
        for (Map.Entry<String, List<String>> counterEntry : b.entrySet()) {
            if (counterEntry.getValue().size() > 1) {
                System.out.println(counterEntry.getKey() + " for keys -> " + counterEntry.getValue());
            }
        }
        // # Attempt 2
        List<Integer> values = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : a.entrySet()) {
           // for (Map.Entry<Integer, String> entry1 : a.entrySet()) {
                //if (entry.getValue().equalsIgnoreCase(s)) {
                    values.add(entry.getKey());
              //}
            }
        System.out.print("Happy with keys -> ");
        for (Integer s : happy) {
            System.out.print( s + " ");
        }
         */
    }

    public static void countOfDup(String[] word) {

        //Question 1 Answer
        HashMap<String, Integer> count = new HashMap<>();

        for (String ab : word) {
            Integer c = count.get(ab);
            if (c == null)
                c = 1;
            else
                c = c + 1;
            count.put(ab, c);
        }

        for (String ab : count.keySet()) {
            if (count.get(ab) != 1)
                System.out.println(ab + " -> " + count.get(ab));
        }
    }
 }
