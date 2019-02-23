package it524.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Leonardo");
        names.add("James");
        names.add("Franco");
        names.add("Alessandro");
        names.add("Chris");

        System.out.println(names.get(2));

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------");

        names.remove(1);

        for (String name : names) {
            System.out.println(name);
        }

        // or lambda

        names.forEach(t-> System.out.println(t));

    }

}
