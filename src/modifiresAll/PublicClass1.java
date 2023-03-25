package modifiresAll;

public class PublicClass1 {
    String spring="beautiful flowers";
    public byte withdraw=50;
    public int balance=60;
    static float farm=7;
    private String bag="nobody allows to use my bag";
    public static void main(String[] args) {
        PublicClass2 testObject= new PublicClass2();
        PublicClass1 myPracticeObject = new PublicClass1();
        System.out.println(myPracticeObject.withdraw);
        System.out.println(myPracticeObject.balance);
        System.out.println(PublicClass1.farm);
        System.out.println(myPracticeObject.bag);
        System.out.println(testObject.tv);

    }
}
