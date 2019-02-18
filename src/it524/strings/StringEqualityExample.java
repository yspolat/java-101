package it524.strings;

public class StringEqualityExample {

    public static void main(String[] args) {

        String s = "there are four apples in John's bag..";

        String s2 = s;


        System.out.println("1");
        System.out.println(s2==s);

        String s3 = "there are four apples in John's bag..";


        System.out.println("2");
        System.out.println(s==s3);


        String s4 = new String("there are four apples in John's bag..");

        System.out.println("3");
        System.out.println(s==s4);


        String str1 = "Java rules!";

        String str2 = "Java ";
        String str3 = "rules!";

        String strFinal = str2 + str3;

        System.out.println("4");
        System.out.println(str1==strFinal);


        System.out.println("5");
        System.out.println(str1.equals(strFinal));


        String sample = "Test";

        System.out.println("6");
        changeValue(sample);
        System.out.println(sample);

    }

    public static void changeValue(String str) {
        str+=" added by method";
    }

}
