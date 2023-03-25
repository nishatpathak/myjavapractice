package loopPractice;

public class SumLoopPractice {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=200;i++){//1+2+3+4+5+....199+200
            sum=sum+i;

        }
        System.out.println(sum);
        int sum1=0;
        for(int i=1;i<=400;i++){
            sum1=sum+i;
        }
        System.out.println(sum1);
    }
}
