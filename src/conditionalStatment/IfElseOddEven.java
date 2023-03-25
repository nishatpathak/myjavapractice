package conditionalStatment;

public class IfElseOddEven {
    public static void main(String[] args) {
        int line1=19;
        int line2= 13;
        int line3= 14;
        int line4=15;
        if(line1%2==0){
            System.out.println(line1+ "even number");
            System.out.println("it's true");
        } else if (line2%2==0) {
            System.out.println(line2+"its even number");
        } else if (line4%2==0) {
            System.out.println(line4+"is evene number");

        } else {
            System.out.println(false);
            System.out.println(line1+"odd number");
        }
        checkMyNumber(10);
        checkMyNumber(13);
    }
    public static void checkMyNumber (int number){
        if(number%2==0){
            System.out.println(number+ "even number");
        }
        else {
            System.out.println(number+"odd number");
        }

    }
}
