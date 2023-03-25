package conditionalStatment;
public class CheckingThreeNumber {
    public static void checkBiggerNumber(int a, int b,int c){
        if (a>b&&a>c){
            System.out.println(a+"is a bigger number");
        }
        else if(b>c&&b>a){
            System.out.println(b+"is a bigger number");
        }
        else {
            System.out.println(c+"is a bigger number");
        }
    }

    public static void main(String[] args) {
        checkBiggerNumber(20,60,40);
    }
}
