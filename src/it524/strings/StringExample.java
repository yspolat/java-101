package it524.strings;

public class StringExample {

    public static void main(String[] args) { String str1 = "Jack";

    String str2 = " is walking";
    String str3 = str1 + str2;
    String str4 = "Jack is walking";

        if(str3==str4)
            System.out.print("true ");
        else
            System.out.print("false ");

        if(str3.equals(str4))
            System.out.print("true ");
        else
            System.out.print("false ");
    }
}
