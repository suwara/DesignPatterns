package manypatterns;

public class EchoDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackerCounter(new QuackEcho(new MallardDuck()) );
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackerCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackerCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackerCounter(new QuackEcho(new RubberDuck()));
    }
}
