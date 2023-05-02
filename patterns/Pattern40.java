package com.patterns;

/*
A
BB
CCC
DDDD
EEEEE
 */

public class Pattern40 {
    public static void main(String[] args) {
        pattern40(5);
    }
    static void pattern40(int n){
        int alphabet=65;
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print((char)(alphabet+row)+"");
            }
            System.out.println();
        }
    }
}
