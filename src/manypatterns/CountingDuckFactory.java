package manypatterns;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackerCounter(new MallardDuck()) ;
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackerCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackerCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackerCounter(new RubberDuck());
    }
}
