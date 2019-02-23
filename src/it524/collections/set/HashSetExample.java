package it524.collections.set;

import java.util.HashSet;
import java.util.Set;


public class HashSetExample {

    public static void main(String[] args) {

        /*

        ~ A HashSet is unordered and unsorted Set.

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

        HashSet<String> factions2 = new HashSet<String>();

        factions2.add("greek");
        factions2.add("parthia");
        factions2.add("macedonia");
        factions2.add("seleucid");
        factions2.add("egypt");

        for (String faction:factions2) {
            System.out.println(faction);
        }

        System.out.println("=======================");

    }
}
