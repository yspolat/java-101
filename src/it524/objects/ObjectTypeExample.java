package it524.objects;

import java.util.Scanner;

public class ObjectTypeExample {


    public static void main(String[] args) {

        Person p1 = new Person(1, "yavuz selim", "polat");
        Person p2 = new Person(1, "yavuz selim", "polat");



        if(p1 == p2) {
            System.out.println("Equal");
        }else {
            System.out.println("No equal");
        }

        Person p3 = p2;

        if(p3 == p2) {
            System.out.println("Equal");
        }else {
            System.out.println("No equal");
        }


        if( p1.equals(p2)) {
            System.out.println("Equal");
        }else {
            System.out.println("No equal");
        }

        Scanner sc = new Scanner(System.in);

        p1.equals(sc);

        System.out.println("--------------");

        System.out.println(p1);
        System.out.println("");



    }

    public static class Person {

        private int id;
        private String name;
        private String lastname;

        public Person() {
            // TODO Auto-generated constructor stub
        }

        public Person(int id, String name, String lastname) {
            super();
            this.id = id;
            this.name = name;
            this.lastname = lastname;
        }

        public void getRegistered() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }



        @Override
        public String toString() {
            return "Person [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
        }

        @Override
        public boolean equals(Object obj) {

            if(obj instanceof Person) {
                if( this.id == ((Person)obj).getId()) {
                    return true;
                }

            }

            return false;


        }

    }


}
