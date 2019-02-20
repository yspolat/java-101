package it524.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        //Example 1
        /*
        ArrayList<String> addresses = null;

        addresses.add("Ankara"); --- Null Pointer Exception, addresses = new ArrayList ... should be defined
        addresses.add("Istanbul");
        */

        // Example 2
        // From Array to List
        String[] isimler = {"Zeynep","Mustafa","Ahmet","Vedat","Ali"};

        List isimlist = Arrays.asList(isimler);

        for (int i = 0; i < isimlist.size(); i++) {
            System.out.println((String)isimlist.get(i));
        }
        //


        // Example 3
        ArrayList<String> names = new ArrayList<>();

        names.add("yavuz");
        names.add("ahmet");
        names.add("osman");
        names.add("mehmet");


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Size of names:" + names.size());


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        names.remove(names.size()-1);

        for (String name : names) {
            System.out.println(name);
        }


        Student stu1 = new Student();
        Address add = new Address();

        stu1.addAddress(add);
    }

    public static class Student {

        private List<Address> addresses;


        public Student() {
            addresses = new ArrayList<>();
        }



        public void addAddress(Address address) {
            this.addresses.add(address);
        }

        public List<Address> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }


    }

    public static class Address {

        private int no;

        public int getNo() {
            return no;
        }
        public void setNo(int no) {
            this.no = no;
        }

    }


}
