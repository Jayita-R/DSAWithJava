package com.basic;

import java.util.Scanner;

public class PrintOneToNrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printOneToN(1,n);
    }

    static void printOneToN(int i,int n) {

        if(i>n){
            return;
        }
        System.out.print(i+" ");

        printOneToN(i+1,n);
    }
}
