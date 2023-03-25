package arrayPractice;

public class OddNumberArrayObjectClass {
    public static void findNumber() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int b : a) {
            if (b % 2 == 0) {
                System.out.println("this is even number" + b);
            }
        }
    }

    public static void findEvenNumber() {
        int[] x = {20, 30, 24, 78, 94, 44, 68, 34};
        for (int y : x) {
            if (y % 2 == 0) {
                System.out.println("its even number" + y);
            }
        }
    }


        public static void main (String[]args){
            findNumber();
            findEvenNumber();
        }

}

