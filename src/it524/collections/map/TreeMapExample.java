package it524.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        /*

        TreeMap

        TreeMap class implements Map interface similar to HashMap class.
         The main difference between them is that HashMap is an unordered collection
            while TreeMap is sorted in the ascending order of its keys.

         */

        TreeMap<Integer,String> teams = new TreeMap<>();

        teams.put(2,"Fenerbahce");
        teams.put(3,"Real Madrid");
        teams.put(1,"Olympiakos");
        teams.put(4,"CSKA");

        // Iterate over all values

        for (Object teamKey : teams.keySet()) {
            System.out.println(teams.get(teamKey));
        }

        // Another way
        /*
        Set set = teams.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry m_entry = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ m_entry.getKey() + " & Value is: ");
            System.out.println(m_entry.getValue());

        }
        */

    }
}
