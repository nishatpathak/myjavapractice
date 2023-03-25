package loopPractice;

public class FibonacciSeries {
    public static void fibonacci(){
        int sum=0;
        int first=0;
        int second=1;
        for(int i=1;i<20;i++){
            System.out.println(sum);
            sum=first+second;
            first=second;
            second=sum;
        }

    }

    public static void main(String[] args) {
        fibonacci();
    }
}
