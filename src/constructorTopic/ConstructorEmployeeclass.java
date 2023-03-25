package constructorTopic;

public class ConstructorEmployeeclass {
    String staff;
    int salary;
    int staffid;
    ConstructorEmployeeclass(String name,int value,int number){
         staff=name;
         salary= value;
        staffid= number;
    }
    public void staffDetails(){
        System.out.println("staff name"+staff);
        System.out.println("staff salary"+ salary);
        System.out.println("staff ID"+staffid);
    }

    public static void main(String[] args) {
        ConstructorEmployeeclass constructorEmployeeclass=new ConstructorEmployeeclass("nisha",50000,89);
        constructorEmployeeclass.staffDetails();
    }
}
