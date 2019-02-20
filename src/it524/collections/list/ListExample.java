package it524.collections.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        /*
        List
        ~
        Ordered
        Add/remove/contains
        Duplicate ok
        Any number of nulls
        get(index)
        ArrayList, Vector, LinkedList
        ~
         */

        List a = new ArrayList();
        List b = new LinkedList();
        List c = new Vector();
        List d = new Stack();

        // ArrayList
        List listA = new ArrayList();

        listA.add("element 1");
        listA.add("element 2");
        listA.add("element 3");

        System.out.println(listA);
    }
}
