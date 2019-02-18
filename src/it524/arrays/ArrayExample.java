package it524.arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // One Dimensional
        int a[] = {1,023};

        int b[] = new int[5];
        b[0] = 1;

        System.out.println(a[1]);

        // Two Dimensional
        int marks[][]={{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};
        System.out.println(marks[1][1]);

        int ab [][] = new int[3][];
        ab[1] = new int[]{1,2,3};

    }
}
