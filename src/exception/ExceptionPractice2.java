package exception;

public class ExceptionPractice2 {
    public static void main(String[] args) {
        int a=0;
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
