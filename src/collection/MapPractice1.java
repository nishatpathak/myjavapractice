package collection;

import java.util.HashMap;

public class MapPractice1 {
    public static void main(String[] args) {
        HashMap<Integer,String> subjeccts=new HashMap<>();
        subjeccts.put(1, "English");
        subjeccts.put(2, "Maths");
        subjeccts.put(3, "Science");
        subjeccts.put(4, "Art");
        subjeccts.put(5, "RE");
        System.out.println(subjeccts);
        System.out.println(subjeccts.get(4));
        System.out.println(subjeccts.remove(2));
        System.out.println(subjeccts.remove(3));
        System.out.println(subjeccts);






        HashMap<Integer,String>tv=new HashMap<>();
        tv.put(1, "LG");
        tv.put(2, "Samsung");
        tv.put(3, "Sony");
        tv.put(4, "BPL");
        tv.put(5, "Video con");
        System.out.println(tv.remove(2));
        System.out.println(tv.get(4));
        System.out.println(tv.get(5));
        System.out.println(tv);
    }
}
