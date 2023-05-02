package com.basic;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumOfNumbers(n,0);
    }

    static void sumOfNumbers(int n, int sum) {
        if(n<1){
            System.out.println("Sum of numbers is:"+sum);
            return;
        }
        sumOfNumbers(n-1,sum+n);
    }

}
