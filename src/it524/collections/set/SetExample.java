package it524.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        /*
        Set

        Order cannot be guaranteed
        Not duplicates
        Add/Contains
        Only 1 null
        No get (index)
        Not maintain insertion order
        HashSet, LinkedHashSet
        SortedSetExample implements SortedSet
         */

        // Same as HashSet<..> factions...

        Set<String> names = new HashSet<>();
        names.add("spain");
        names.add("spqr");
        names.add("spain");
        names.add("gaul");
        names.add("armenia");
        names.add("scania");
        names.add("germania");

        // Remove
        //names.remove("");
        //

        for (String name : names) {
            System.out.println(name);
        }

    }
}
