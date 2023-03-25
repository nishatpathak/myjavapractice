package conditionalStatment;

public class SwitchClasspractice2 {
    public static void main(String[] args) {
        int summerMonths =6;

        switch (summerMonths){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august are summer months");
                break;
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
