package it524.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

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
