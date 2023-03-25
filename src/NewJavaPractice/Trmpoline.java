package NewJavaPractice;

public class Trmpoline {
    //state//
    static int tall=20;
    static short broad=12;
static byte length=40;
static String use="kids";
//behavior//
    public static void jumping(){
        System.out.println("kids can jump");
    }
public static void bouncing(){
    System.out.println("adults can bounce");
}
public static void play(){
    System.out.println("everyone can play");
    }
public static void main(String[] args) {
        System.out.println(tall);
        System.out.println(broad);
        System.out.println(length);
        System.out.println(use);
        jumping();
        bouncing();
        play();
    }

    }