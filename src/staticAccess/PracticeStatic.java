package staticAccess;

public class PracticeStatic {
    static int sandbags=30;
    int ciment=20;
    public static void builtpark(){
        System.out.println("how many sand bags do we need to built a park");
    }
    public void builtparkstrong(){
        System.out.println("with ciment it's gonna be strong park");
    }
    public static void main(String[] args) {
        System.out.println(sandbags);
        builtpark();
        PracticeStatic staticobject= new PracticeStatic();
        System.out.println(staticobject.ciment);
        staticobject.builtparkstrong();
    }
}
