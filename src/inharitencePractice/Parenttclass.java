package inharitencePractice;

public class Parenttclass {
    int money=80000;
    String valuable="gold";
    public void parentproperties(){
        System.out.println("3 House");
    }

    public static void main(String[] args) {
        Parenttclass parentclass=new Parenttclass();
        System.out.println(parentclass.money);
        System.out.println(parentclass.valuable);
        parentclass.parentproperties();

    }

}
