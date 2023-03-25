package arrayPractice;

public class SumArrayPractice {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int sum = 0;
        for (int b : a) {
            sum = sum + b;
        }
        System.out.println(sum);
        int mul2= a[2]*a[3];
        System.out.println(mul2);
        int[] z= {5,10};
        int sum1=0;
        for(int y:z){
            sum1= sum1 + y;
        }
        System.out.println(sum1);
        int[] f={2,3,6};
        int mul=1;
        for(int r:f){
            mul=mul*r;
        }
        System.out.println(mul);

    }
    }



