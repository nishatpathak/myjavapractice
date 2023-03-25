package inharitencePractice;

public class OverLoadingPractice2 {
    public static void myProperties(int year){
        System.out.println("I bought 2 houses in"+" "+year);
    }
    public static void myProperties(int number,String jwellery,String vehicle){
        System.out.println("I bought"+"  "+ number+" "+jwellery+" "+"and a"+" "+vehicle);
    }
    public static void myProperties(int count,String property){
        System.out.println("I will buy"+ " "+count+" "+ property);
    }

    public static void main(String[] args) {
        myProperties(2019);
        myProperties(2,"necklace","car");
        myProperties(3,"houses");
    }
    }

