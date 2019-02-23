package it524.generics;

public class GenericExample {

    public static void main(String[] args) {

        Box<String> strBox = new Box<>();
        strBox.setInnerobject("jack");

        //Wrappers :String, Integer, Double, Boolean

        Box<Integer> intBox = new Box<>();
        intBox.setInnerobject(4);

        Box<Object> objBox = new Box<>();
        objBox.setInnerobject(new Object());


        // Java Default Boxing
        Integer i1 = 4;

        //Java Default Unboxing
        int i2 = i1;

    }
}
