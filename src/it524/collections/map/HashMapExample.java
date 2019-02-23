package it524.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        /*
            HashMap

            HashMap doesn’t provide any guarantee over the way the elements are arranged in the Map.
            It means, we can’t assume any order while iterating over keys and values of a HashMap:
         */

        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(3, "TreeMap");
        hashmap.put(2, "vs");
        hashmap.put(1, "HashMap");
    }
}
