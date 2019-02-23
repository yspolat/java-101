package it524.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExample2 {
    public static void main(String[] args) {

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(1322, "Jacob");
        myMap.put(2332, "John");
        myMap.put(3442, "Jack");

        System.out.println( myMap.get("Jack"));

        Set myKeySet = myMap.keySet();

        for (Iterator iterator = myKeySet.iterator(); iterator.hasNext();) {
            int key = (Integer)iterator.next();
            System.out.println(myMap.get(key));
        }

    }
}
