package com.basic;

import java.util.Scanner;

public class SumOfNnumsFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Sum of numbers is: "+sumOfNumsFunc(n));
    }

    static int sumOfNumsFunc(int n) {
        if(n==0)
            return 0;
        return n+sumOfNumsFunc(n-1);
    }
}
