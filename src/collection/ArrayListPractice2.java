package collection;

import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer>register=new ArrayList<>();
        register.add(30);
        register.add(21);
        register.add(56);
        register.add(41);
        System.out.println(register);
        System.out.println("these two pupils have left the school");
        register.remove(3);
        register.remove(1);
        System.out.println(register);
    }

}
