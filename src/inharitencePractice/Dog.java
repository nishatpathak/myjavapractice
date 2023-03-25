package inharitencePractice;

public class Dog implements Animals{
    @Override
    public void eating() {
        System.out.println("Bones");

    }

    @Override
    public void speaking() {
        System.out.println("Woof Woof");

    }
}
