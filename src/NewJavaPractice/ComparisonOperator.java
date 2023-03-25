package NewJavaPractice;

public class ComparisonOperator {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        boolean answer=a==b;
        //false//
        System.out.println(answer);
        int x=20;
        int y=30;
        boolean ans=x<y;
        //true//
        System.out.println(ans);
        int c=6;
        int d=9;
        boolean ans1=c>d;
        //false//
        System.out.println(ans1);
        int e= 40;
        int f=50;
        boolean ans2=e>=f;
        //false//
        System.out.println(ans2);
        int g=60;
        int h=90;
        boolean ans3=g<=h;
        //true//
        System.out.println(ans3);
        int r= 50;
        int s= 40;
        boolean ans4=r!=s;
        //true//
        System.out.println(ans4);
        int u=50;
        int v=50;
        boolean ans5=u!=v;
        //false//
        System.out.println(ans5);
    }
}
