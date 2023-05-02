package com.jayita;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        int c=0;
        if(num==0 || num==1){
            System.out.println("Fibonacci number is "+num);
        }
        else {
            while (count <= num) {
                c = a + b;
                a = b;
                b = c;
                count++;
            }
            System.out.println("Fibonacci number is " + c);
        }
    }
}
