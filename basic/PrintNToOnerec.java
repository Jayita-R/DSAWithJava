package com.basic;

import java.util.Scanner;

public class PrintNToOnerec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNToOnerec(n,n);
    }

    static void printNToOnerec(int i,int n) {

        if(i<1){
            return;
        }
        System.out.print(i+" ");

        printNToOnerec(i-1,n);

    }
}
