package inharitencePractice;

public class ChildClass extends Parenttclass{
    int car=1;
    String clothes="sari";
    public void childproperties(){
        System.out.println("enough goods");
    }

    public static void main(String[] args) {
        ChildClass childclass=new ChildClass();
        System.out.println(childclass.car);
        System.out.println(childclass.clothes);
        childclass.childproperties();
        System.out.println(childclass.valuable);
        System.out.println(childclass.money);
        childclass.parentproperties();
    }
}
