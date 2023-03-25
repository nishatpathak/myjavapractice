package conditionalStatment;

public class IfElsePractice6 {
    public static void divideInGroups(int a,int b,int c,int d) {
        if (a != b && b < c) {
            System.out.println("people will be in green group");
        if (a < b || c > b) {
            System.out.println("peoplr will be in yellow group");
        } else if (b > a && c != a) {
            System.out.println("people will be in red group");
        } else {
            System.out.println("people will be in blue group");
        }
    } else {
            System.out.println("rest of the people will be in pink group");
        }
    }
    public static void main(String[] args) {
      divideInGroups(20,30,40,60);
    }
     }
