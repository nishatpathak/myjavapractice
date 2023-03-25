package inharitencePractice;

public class Cat implements Animals{

    @Override
    public void eating() {
        System.out.println("mouse");

    }

    @Override
    public void speaking() {
        System.out.println("Meow Meow");

    }
}
