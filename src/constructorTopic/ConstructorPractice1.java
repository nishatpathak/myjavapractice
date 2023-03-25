package constructorTopic;

public class ConstructorPractice1 {
    String Bank;
    int balance;
    int withdraw;
    ConstructorPractice1(String Santender,int all ,int some){
        Bank=Santender;
        balance=all;
        withdraw=some;
    }
    public void bankdetails(){
        System.out.println("bank name"+ " "+Bank);
        System.out.println("blaance"+ " "+balance);
        System.out.println("withdraw"+ " "+withdraw);
    }

    public static void main(String[] args) {
        ConstructorPractice1 constructorPractice1= new ConstructorPractice1("Santender",450,320);
        constructorPractice1.bankdetails();
    }

}
