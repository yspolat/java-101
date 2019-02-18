package it524.misc.ex1.b;

import it524.misc.ex1.a.*;

public class Baz{
    public static void main(String[] args){
        Foo f = new Foo();

        /*
        Cannot be accessible a and b fields.
         */

        //System.out.print("" + f.a);
        //System.out.print("" + f.b);
        System.out.print("" + f.c);
    } }
