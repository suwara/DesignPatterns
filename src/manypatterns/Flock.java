package manypatterns;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers;

    public Flock() {
        quackers = new ArrayList<>();
    }

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        for (int i = 0; i < quackers.size(); i++) {
            if(i==0){
                quackers.get(i).quack();
                quackers.get(i).quack();
                quackers.get(i).quack();
            } else{
                quackers.get(i).quack();
            }
        }
    }
}
