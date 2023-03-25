package NewJavaPractice;

public class ParameterizedMethodPractice {
    public static void withdrawMoney(int a){
        System.out.println(a);
    }
    public static void flyingBirds(String bird1,String bird2,String bird3){
        System.out.println(bird1+bird2+bird3);
    }
    public static void MultiplyTwoDijit(int a,int b,int c){
        System.out.println(a*b*c);
    }
    public static void main(String[] args) {
        int a=400;
        withdrawMoney(a);
        MultiplyTwoDijit(20,30,40);
        flyingBirds("red-kite","eagle","crow");
        MultiplyTwoDijit(5,7,9);

    }
}
