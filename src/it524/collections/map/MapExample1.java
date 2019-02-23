package it524.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {

        /*

        Map
            - Key value pairs
			- Keys are unique (form a set)
			- HashMap, TreeMap

        A map has the form Map <K, V> where:
            K: specifies the type of keys maintained in this map.
            V: defines the type of mapped values

         */

        Map<Integer,String> countryCodes = new HashMap<>();

        countryCodes.put(90,"Turkey");
        countryCodes.put(1,"United States of America");
        countryCodes.put(31,"Netherlands");

        // Keys are unique, so Netherlands will be replaced as Italy.
        countryCodes.put(31,"Italy");

        System.out.println("Total Countries: " + countryCodes.size());

        // Iterate over all of values
        for (Object countryCode: countryCodes.keySet()) {
            System.out.println("Key: " + countryCode + " - Value: " + countryCodes.get(countryCode));
        }

        // Search a value

        String searchValue = "Turkey";

        if(countryCodes.containsValue(searchValue)){
            System.out.println("Found " + searchValue + "in country code map.");
        }

        // Search a key

        int searchKey = 90;

        if(countryCodes.containsKey(searchKey)){
            System.out.println("Found, " + countryCodes.get(searchKey) + "'s country code is +" + searchKey);
        }

        // Clear all values
        countryCodes.clear();

    }
}
