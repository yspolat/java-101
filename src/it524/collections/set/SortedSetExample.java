package it524.collections.set;

import java.util.SortedSet;

public class SortedSetExample {
    public static void main(String[] args) {

        /*

        Sorted Set

        SortedSetExample implements SortedSet
        Only difference from Set, it is sorted.

         */

        SortedSet<String> fruits = new java.util.TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println(fruits);
    }
}
