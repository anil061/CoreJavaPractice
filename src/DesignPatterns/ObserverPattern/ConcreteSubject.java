package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void attach(Observer o) {
       observers.add(o);
    }

    @Override
    public void detach(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {

    }
}
