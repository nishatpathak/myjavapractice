package exception;

public class ThrowsThrowPractice {
    public static void credit()throws ArithmeticException{
        int a=0;
        int b =a/0;
    }

    public static void main(String[] args) {
        credit();
    }
}
