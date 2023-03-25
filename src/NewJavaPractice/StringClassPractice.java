package NewJavaPractice;

public class StringClassPractice {
    public static void main(String[] args) {
        String book=  "Room on the broom";
        String author="Julia" + "Donaldson";
        String illustratedby= "Axel Scheffler";
        String witchbrain= "";
        System.out.println(book.length());
        System.out.println(author.concat(book));
        System.out.println(author.toLowerCase());
        System.out.println(book.trim());
        System.out.println(illustratedby.contains("z"));
        System.out.println(author.isEmpty());
        System.out.println(witchbrain.isEmpty());
        System.out.println(book.replace("Room on the broom","room is there on the broom" +
                ""));
        System.out.println(author.toUpperCase());


    }
}
