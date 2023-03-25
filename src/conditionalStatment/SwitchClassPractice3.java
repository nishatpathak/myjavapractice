package conditionalStatment;

public class SwitchClassPractice3 {
    public static void main(String[] args) {
        int enter=3;

        switch (enter){
            case 1:
                System.out.println("game start");
                break;
            case 2:
                System.out.println("game pause");
                break;
            case 3:
                System.out.println("game over");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
