package DesignPatterns.ObserverPattern;

/*Defines a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically.*/
public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
