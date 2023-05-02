package com.basic;

import java.util.Scanner;

public class PrintNameRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printName(1,n);
    }

    static void printName(int i,int n) {

        if(i>n){
            return;
        }
        System.out.println("Jayita");

        printName(i+1,n);
    }
}
