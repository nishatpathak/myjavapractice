package NewJavaPractice;

public class ReturnMethodPractice {
    public static int subTwoNumbers(){
        int a=20;
        int b=30;
        int c=a*b;
        return c;
    }
    public static String girlsRunning(){
        String place="Manchester";
        return place;
    }
    public static boolean sunShining(){
        boolean rain= false;
        return rain;
    }
    public static float myMobile(){
        float number=23444;
        return number;
    }
    public  int countTotal(){
        int c=70;
        int d= 80;
        int e= c+d;
        return e;

    }
        public static void main(String[] args) {
        System.out.println(subTwoNumbers());
        System.out.println(girlsRunning());
            System.out.println(sunShining());
            System.out.println(myMobile());
            ReturnMethodPractice runMethod= new ReturnMethodPractice();
            System.out.println(runMethod.countTotal());

    }
}
