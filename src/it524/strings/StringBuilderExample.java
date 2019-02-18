package it524.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "Java is very good";

        //Problematic for memory
        str+= " but some people do not like it..";

        System.out.println(str);
        //StringBuilder
        //StringBuffer


        StringBuilder builder = new StringBuilder("test test tst");
        builder.append(" added string...");

        System.out.println(builder);
    }
}
