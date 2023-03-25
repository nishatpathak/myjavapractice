package modifiresAll;

public class PublicClass2 {
    protected int tv=23;
    public static void main(String[] args) {
PublicClass2 testObject= new PublicClass2();
        System.out.println(testObject.tv);
        PublicClass1 myPracticeObject=new PublicClass1();
        System.out.println(myPracticeObject.withdraw);
        System.out.println(PublicClass1.farm);
        System.out.println(myPracticeObject.spring);
    }
}
