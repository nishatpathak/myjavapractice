package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class HashSetPractice2 {
    public static void main(String[] args) {
        HashMap<Integer, String> fibers = new HashMap<>();
        fibers.put(1, "mango");
        fibers.put(2, "apple");
        fibers.put(3, "kiwi");
        fibers.put(4, "banana");
        fibers.put(5, "pear");
        fibers.put(6, "grapes");


        HashSet<Integer> keys = new HashSet<>();
        ArrayList<String> value = new ArrayList<>();
        for (int i : fibers.keySet())
            keys.add(i);
        {
            System.out.println(keys);

            for (String fruit : fibers.values()) {
                value.add(fruit);
                {
                    System.out.println(fruit);
                }

            }
        }
    }
}
