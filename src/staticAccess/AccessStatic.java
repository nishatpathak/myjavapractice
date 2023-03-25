package staticAccess;

public class AccessStatic {
    public static void main(String[] args) {
        System.out.println(PracticeStatic.sandbags);
        PracticeStatic.builtpark();

        PracticeStatic newobject= new PracticeStatic();
        System.out.println(newobject.ciment);
        newobject.builtparkstrong();

    }
}
