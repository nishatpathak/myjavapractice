package NewJavaPractice;

public class LogicalOperator {
    public static void main(String[] args) {
        int q=30;
        int r=40;
        boolean ans1= q<r &&q<40;
        //true//
        System.out.println(ans1);
        int s=70;
        int t=60;
        boolean ans2=t<s && s>80;
        //false//
        System.out.println(ans2);
        int u= 20;
        int i=10;
        boolean ans3= u>i || u<i;
        //true//
        System.out.println(ans3);
        int l=5;
        int n=4;
        boolean ans4=l<n||n>l;
        //false//
        System.out.println(ans4);
        int v=9;
        int w=8;
        boolean ans5=( !(v>w)||w<5);
        //false//
        System.out.println(ans5);
        int b=9;
        int d=8;
        boolean ans6=( !(b<d)||d<10);
        //true//
        System.out.println(ans6);

    }
}
