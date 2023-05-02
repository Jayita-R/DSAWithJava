package com.basic;

import java.util.Scanner;

public class PrintNToOnebacktrack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNToOneback(1,n);
    }

    static void printNToOneback(int i,int n) {

        if(i>n){
            return;
        }


        printNToOneback(i+1,n);
        System.out.print(i+" ");
    }
}
