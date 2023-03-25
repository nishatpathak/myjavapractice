package inharitencePractice;

public class ClassC extends ClassB{
    int c=30;
    public void myMethodC(){
        System.out.println("this is class C");
    }

    public static void main(String[] args) {
        ClassC classc=new ClassC();
        System.out.println(classc.a);
        System.out.println(classc.b);
        System.out.println(classc.c);
        classc.myMethodA();
        classc.myMethodB();
        classc.myMethodC();
    }
}
