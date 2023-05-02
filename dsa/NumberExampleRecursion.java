package com.dsa;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n) {
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //this is tail recursion
        printNum(n+1);
    }
}
