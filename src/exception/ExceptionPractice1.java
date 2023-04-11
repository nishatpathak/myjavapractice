package exception;

public class ExceptionPractice1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        arr[3]=70;
        try {System.out.println(arr[7]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("run the code after the error");
        }
        arr[2]=100;

             for (int a:arr){
                 System.out.println(a);
             }
            


    }
}

