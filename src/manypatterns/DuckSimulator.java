package manypatterns;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new EchoDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(mallardDuck);

        Flock flockOfNotDuck = new Flock();
        flockOfNotDuck.add(goose);
        flockOfNotDuck.add(pigeon);

        flockOfDucks.add(flockOfNotDuck);

        System.out.println("\nDuck Simulator");

        simulate(flockOfDucks);

        System.out.println("Num quacks = " + QuackerCounter.getNumberOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
