package conditionalStatment;

public class NestedmethodPracticeIfElseIfElse {
    public static void main(String[] args) {
        checkStudentsGrade(54);
        checkStudentsGrade(41);
        checkStudentsGrade(32);
        checkStudentsGrade(88);
        checkStudentsGrade(98);}
    public static void checkStudentsGrade(int marks){
        if (marks >=40&& marks <=60){
            System.out.println("grade c");}
        else if (marks >70&&marks<=80){
            System.out.println("grade b");}
        else if(marks>80&&marks<=90){
            System.out.println("grade a");}
        else if (marks >90&&marks<=100){
            System.out.println("grade e");}
        else {
            System.out.println("student is fail");
        }
    }
}
