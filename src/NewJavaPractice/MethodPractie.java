package NewJavaPractice;

public class MethodPractie {

    public static void makingTea(){

        System.out.println("Making tea is very easy");
    }
    public static void multiplyTwoNumbers(){
        int a=200;
        int b=400;
        System.out.println(a*b);

    }public static String runTheMarathon(){
        String Marathon= "London";
        return Marathon;

    }
    public static void main(String[] args) {
        makingTea();
        multiplyTwoNumbers();
        String runningMarathon= runTheMarathon();
        System.out.println(runningMarathon);

    }
}
