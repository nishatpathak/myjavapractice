package NewJavaPractice;

public class ReturnParameterMixPractice {
    public static int balanceTotal(int a,int b,int c){
        int d=a+b+c;
        return d;
    }public float countNumber(float a,float b){
        float c= a-b;
        return c;
    }
    public static boolean makeSureEnoughStock(int stock, int demand){
        boolean customer= demand <= stock;
        return customer;

    }
    public static void main(String[] args) {
        System.out.println("Yes customer can add to basket product");
        System.out.println(makeSureEnoughStock(700,400));
        System.out.println(balanceTotal(10,20,50));
        System.out.println(totalBill (100.88,200.99,300.89));
        ReturnParameterMixPractice total=new ReturnParameterMixPractice();
        System.out.println(total.countNumber(90,30));
    }
    public static double totalBill(double x,double y,double z){
        double t=x*y*z;
        return t;
    }
}
