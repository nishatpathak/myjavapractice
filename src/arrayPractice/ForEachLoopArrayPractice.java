package arrayPractice;

public class ForEachLoopArrayPractice {
    public static void main(String[] args) {
        String[] farmAnimals={"cow","dog","cat","pig","horse","sheep"};
for(String all:farmAnimals){
    System.out.println(all);
}
        System.out.println("============");
String[]wildAnimals={"lion","tiger","rino","hippo","giraffe"};
for(String jungle:wildAnimals){
    System.out.println(jungle);
}
int[] money={12,21,44,67,89,96,5,44};
        for (int value:money){
            System.out.println(value);
        }
        System.out.println("++++++++++++");
        int[] withdraw={20,90,800,70,60,50};
        for(int customer:withdraw){
            System.out.println(customer);
        }

    }
}
