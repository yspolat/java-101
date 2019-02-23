package it524.generics;

public class Box<T> {

    public T innerobject;

    public T getInnerObject() {
        return this.innerobject;
    }

    public void setInnerobject(T innerobject) {
        this.innerobject = innerobject;
    }

    public String getInnerObjectClassName() {
        return innerobject.getClass().getName();
    }
}
