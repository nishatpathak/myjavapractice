package inharitencePractice;

public class ClassB extends ClassA {
    int b=20;
    public void myMethodB(){
        System.out.println("this is class B");
    }

    public static void main(String[] args) {
        ClassB classB=new ClassB();
        System.out.println(classB.a);
        System.out.println(classB.b);
        classB.myMethodA();
        classB.myMethodB();
    }
}
