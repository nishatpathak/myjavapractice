package arrayPractice;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int bill[]={20,30,50,60,46,75,33,27,38,45,78,98,38,11,23,49,19,29,30};
         bill[1]=bill[4]*bill[2];
        System.out.println(bill[1]);
        int billLenth=bill.length;
        System.out.println(billLenth);
        if ( bill[3]<bill[4]){
            System.out.println("first position is bigger");
        }
        else {
            System.out.println("second position is bigger");
        }
        for(int i=0;i<bill.length;i++){
            System.out.println(bill[i]);
        }
        int total[]={1,2,3,4,5,6,7,8,9,1,2,3,3,5,6,7,8,4,5,6,7,8,1,2,3};
        int totalLength=total.length;
        System.out.println(totalLength);
        for (int x=0;x<totalLength;x++){
            System.out.println(total[x]);
        }
        System.out.println("-------");
        for (int y=totalLength-1;y>=0;y--){
            System.out.println(total[y]);
        }

    }



}
