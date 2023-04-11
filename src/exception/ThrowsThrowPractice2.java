package exception;

public class ThrowsThrowPractice2 {
    public static void years (int identify ) throws ArithmeticException{
        if (identify< 18){
            throw  new ArithmeticException("eligible to drive");
        }
        else
            System.out.println("Not eligible to drive");
    }

    public static void main(String[] args) {
        years(13);
        years(20);
        years(18);
        years(21);
    }
}
