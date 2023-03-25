package inharitencePractice;

public class Cow implements Animals{
    @Override
    public void eating() {
        System.out.println("grass");
    }

    @Override
    public void speaking() {
        System.out.println("MOO");

    }
}
