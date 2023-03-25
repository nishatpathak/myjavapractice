package inharitencePractice;

public class ClassD extends ClassA{
    int d=40;
    public void myMethodD(){
        System.out.println("this is class D");
    }

    public static void main(String[] args) {
        ClassD classd=new ClassD();
        System.out.println(classd.a);
        System.out.println(classd.d);
        classd.myMethodA();
        classd.myMethodD();
    }
}
