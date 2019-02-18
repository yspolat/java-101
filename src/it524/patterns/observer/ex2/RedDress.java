package it524.patterns.observer.ex2;

import java.util.ArrayList;

public class RedDress implements  Observable {

    private boolean inStock = true;
    private ArrayList<Observer> users = new ArrayList<>();

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObserve();
    }

    @Override
    public void addObserve(Observer a) {
        users.add(a);
    }

    @Override
    public void removeObserve(Observer a) {
        users.remove(a);
    }

    @Override
    public void notifyObserve() {
        for(Observer user : users){
            user.update();
        }
    }
}
