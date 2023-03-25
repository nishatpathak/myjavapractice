package constructorTopic;

public class SwimmingCompetition {
    String students;
    int laps;
    int meters;
    SwimmingCompetition(String kids,int upanddown,int totallength){
        students= kids;
        laps=upanddown;
        meters=totallength;
    }
    public void kidsCompetition(){
        System.out.println("student name"+" "+ students);
        System.out.println("lapse"+" "+ laps);
        System.out.println("meters"+" "+ meters);
    }

    public static void main(String[] args) {
        SwimmingCompetition swimmingCompetition=new SwimmingCompetition("nisha",5,10);
        swimmingCompetition.kidsCompetition();
    }
}
