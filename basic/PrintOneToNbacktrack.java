package com.basic;

import java.util.Scanner;

public class PrintOneToNbacktrack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printOneToNback(n,n);
    }

    static void printOneToNback(int i,int n) {

        if(i<1){
            return;
        }


        printOneToNback(i-1,n);
        System.out.print(i+" ");
    }
}
