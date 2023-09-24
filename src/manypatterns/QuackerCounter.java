package manypatterns;

public class QuackerCounter implements Quackable{
    private Quackable duck;
    private static int numberOfQuacks;

    public QuackerCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks(){
        return numberOfQuacks;
    }
}
