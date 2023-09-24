package manypatterns;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);

        Flock flockOfRubberDuck = new Flock();
        flockOfRubberDuck.add(rubberDuck);
        flockOfRubberDuck.add( duckFactory.createRubberDuck());
        flockOfRubberDuck.add( duckFactory.createRubberDuck());

        flockOfDucks.add(flockOfRubberDuck);

        System.out.println("\nDuck Simulator");

        simulate(flockOfDucks);

        System.out.println("Num quacks = " + QuackerCounter.getNumberOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
