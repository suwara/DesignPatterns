package manypatterns;

public class GooseAdaptor implements Quackable {

    private Goose goose;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
        goose.honk();
    }
}
