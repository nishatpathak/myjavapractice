package inharitencePractice;

public class OverLoadingPractice1 {
    public static void mymeal(String breakfast){
        System.out.println("I will have for my breakfast"+" "+breakfast);
    }
    public static void mymeal(String lunch1,String lunch2){
        System.out.println("I will have for my lunch"+" "+lunch1+" "+lunch2);
    }
    public static void mymeal(String dinner1,String dinner2,String dinner3){
        System.out.println("I will have for my dinner"+" "+dinner1+" "+dinner2+" "+dinner3);
    }

    public static void main(String[] args) {
        mymeal("cerial");
        mymeal("dal","rice");
        mymeal("beans","toast","cake");
    }
}
