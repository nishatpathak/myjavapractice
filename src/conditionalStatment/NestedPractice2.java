package conditionalStatment;
public class NestedPractice2 {
    public static void cinemaTickets(int charges) {
        if (charges >= 0 && charges <= 40) {

            if (charges >= 35 && charges <= 45) {
                System.out.println("buy silver ticket");
            } else if (charges >= 45 || charges <= 55) {
                System.out.println("buy gold tickets");
            } else if (charges >= 55 && charges < 65) {
                System.out.println("buy pletinum tickets");
            } else {
                System.out.println("buy bronze tickets");
            }
        }
        else{
            System.out.println("result incorrect");
        }}
    public static void main(String[] args) {
        cinemaTickets(58);
        cinemaTickets(40);
        cinemaTickets(6);
        cinemaTickets(99);

    }
}
