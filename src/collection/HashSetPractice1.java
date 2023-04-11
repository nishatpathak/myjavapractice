package collection;

import java.util.HashSet;

public class HashSetPractice1 {
    public static void main(String[] args) {
        HashSet<String>clothes=new HashSet<String>();
        clothes.add("shirt");
        clothes.add("dress");
        clothes.add("socks");
        clothes.add("trousers");
        clothes.add("skirt");
        clothes.remove("socks");

        System.out.println(clothes.size());

        HashSet<Integer>total=new HashSet<>();
        total.add(8000);
        total.add(2865);
        total.add(800);
        total.add(875);
        total.add(234);
        total.add(678);
        total.add(900);
        System.out.println();
total.remove(2);
        System.out.println("HashSet: " + clothes);
        System.out.println("Length of HashSet: " + clothes.size());
        System.out.println(total);





    }
}
