package loopPractice;
public class ForLoopTimeTable {
    public static void timeTable(int tableNumber){
        System.out.println("this is my table of" +" "+tableNumber);
        System.out.println("***************************");
        for(int i=1;i<=12;i++){
            System.out.println(tableNumber*i);
        }
        System.out.println("**************************");
    }
    public static void main(String[] args) {
        timeTable(13);
        timeTable(14);
        timeTable(15);
        timeTable(16);
    }
}




