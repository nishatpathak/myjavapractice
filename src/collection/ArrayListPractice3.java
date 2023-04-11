package collection;

import java.util.ArrayList;

public class ArrayListPractice3 {
    public static void main(String[] args) {
        ArrayList<Integer> shoeSize= new ArrayList<>();
        shoeSize.add(3);
        shoeSize.add(4);
        shoeSize.add(5);
        shoeSize.add(6);
        shoeSize.add(7);
        shoeSize.add(8);
        shoeSize.add(2);
        shoeSize.remove(4);
        shoeSize.remove(3);
        System.out.println(shoeSize);

    }
}
