package arrayPractice;

public class LargestAndSmallestNumberArray {
    public static void main(String[] args) {
        int[]numbers={82,74,58,23,3,4,5,688,72,14};
        int size=numbers.length;
        //Arrays.sort(numbers);
        int smallest=numbers[0];
        int largest=numbers[size-1];
        System.out.println("smallest eliment is"+smallest);
        System.out.println("largest eliment is"+largest);
    }
}
