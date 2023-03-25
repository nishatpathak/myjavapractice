package NewJavaPractice;

public class RoseFlower {
    //state//
    String colour = "it can come in various colours";
    int size = 4;
    byte large = 5;
    float quantity = 30;
    boolean smell = true;

    //behaviour//
    public void beautiful() {
        System.out.println("very preety flower");
    }

    public void usage() {
        System.out.println("people use it for greetings");
    }

    public void grow() {
        System.out.println("it can grow in hot country");

    }


    public static void main(String[] args) {
        //object//
        RoseFlower allAboutRose = new RoseFlower();
        System.out.println(allAboutRose.colour);
        System.out.println(allAboutRose.large);
        System.out.println(allAboutRose.quantity);
        System.out.println(allAboutRose.size);
        System.out.println(allAboutRose.smell);
        allAboutRose.beautiful();
        allAboutRose.usage();
        allAboutRose.grow();

    }
}
