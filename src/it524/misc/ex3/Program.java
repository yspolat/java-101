package it524.misc.ex3;

public class Program {
    public static void main(String[] args) {

        /*
        No compilation/runtime error
         */
        new Hound().bark();
        new Hound().sniff();

        /*

        Compilation error, because Dog doesn't have sniff method.

        ((Dog)new Hound()).sniff();
         */


    }
}
