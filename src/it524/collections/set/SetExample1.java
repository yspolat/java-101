package it524.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {

        /*
        Hash Set

        ~ A HashSet is unordered and unsorted Set.

        Order cannot be guaranteed
        Not duplicates
        Add/Contains
        Only 1 null
        No get (index)
        Not maintain insertion order
        HashSet, LinkedHashSet
        TreeSet implements SortedSet
         */

        HashSet<String> factions = new HashSet<String>();

        factions.add("greek");
        factions.add("parthia");
        factions.add("macedonia");
        factions.add("seleucid");
        factions.add("egypt");

        for (String faction:factions) {
            System.out.println(faction);
        }

        System.out.println("=======================");


        Set<String> names = new HashSet<>();
        names.add("spain");
        names.add("spqr");
        names.add("spain");
        names.add("gaul");
        names.add("armenia");
        names.add("scania");
        names.add("germania");


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=======================");

        /*
        LinkedHashSet

        contains unique elements only like HashSet.
        provides all optional set operation and permits null elements.
        maintains insertion order

        hashset-vs-linkedhashset

        LinkedHashSet has better performance,

        Predictable iteration order LinkedHashSet (Oracle)
        LinkedHashSet is more expensive for insertions than HashSet;
        In general slightly better performance than HashMap, because the most of the time we use Set structures for iterating.
         */

        LinkedHashSet<String> set = new LinkedHashSet();

        set.add("Z");
        set.add("Y");
        set.add("Z");
        set.add("B");
        set.add("A");

        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
