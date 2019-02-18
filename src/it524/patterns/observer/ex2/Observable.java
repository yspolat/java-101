package it524.patterns.observer.ex2;


public interface Observable {

    void addObserve(Observer a);
    void removeObserve(Observer a);
    void notifyObserve();

}
