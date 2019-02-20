package it524.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample2 {

    public static void main(String[] args) {

        /*
        HashMap keys are HashSet. Must be unique, no duplicate.
        Set(kume), therefore shouldn't be duplicate
         */

        // No duplicates for IDs
        // Check Faction class and equals override

        Set<Faction> factions = new HashSet<>();

        Faction fa1 = new Faction(1,"spqr");
        Faction fa2 = new Faction(2,"egypt");
        Faction fa3= new Faction(3,"macedonia");
        Faction fa4 = new Faction(1,"carthage");
        Faction fa5 = new Faction(5,"pontus");

        factions.add(fa1);
        factions.add(fa2);
        factions.add(fa3);
        factions.add(fa4);
        factions.add(fa5);

        for (Faction faction : factions) {
            System.out.println(faction.getName());
        }

        System.out.println("=======================");

        /*
        TreeSet Set
        TreeSet implements SortedSet
         One difference from Set, it is sorted.
         */

        SortedSet<String> fruits = new TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println(fruits);

    }
}
