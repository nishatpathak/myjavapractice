package inharitencePractice;

public class OverRidingA extends OverRididngB {
    public void myJourney(){
        System.out.println("My plan is to be on holiday for 3 weeks");
    }

    public static void main(String[] args) {
        OverRidingA overRidingA=new OverRidingA();
        overRidingA.myJourney();
    }
}
