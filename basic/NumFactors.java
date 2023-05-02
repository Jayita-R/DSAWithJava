package com.basic;

import java.util.Scanner;

public class NumFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int num=sc.nextInt();
        System.out.print("Factors of the number are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0) {
                System.out.print(i + " ");
            }
        }
    }
}
