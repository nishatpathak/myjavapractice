package collection;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.ArrayList;
//Arraylist= declare,add,remove,print,get(need to learn these 4)

public class ArrayListPractice4 {
    public static void main(String[] args) {
        ArrayList<String> pupilsNames = new ArrayList<>();//declare
        pupilsNames.add("Anthony");//add
        pupilsNames.add("Ben");//add
        pupilsNames.add("Charlie");
        pupilsNames.add("Dominik");
        System.out.println(pupilsNames);//print
        pupilsNames.remove(3);//remove
        for (String name:pupilsNames){
            System.out.println(name);

        }
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        for (int value:numbers)
            System.out.println(value);{
            }
            int total= numbers.get(3)+numbers.get(4);//get
        System.out.println(total);
        System.out.println(numbers.size());//size
        ArrayList<Integer>id=new ArrayList<>();
        id.add(12);
        id.add(13);
        id.add(14);
        id.add(15);
        id.add(16);
        id.add(17);
        id.add(18);
        id.add(19);
        int totalnumer=id.get(4)+id.get(id.size()-1);
        System.out.println(totalnumer);



    }
}
