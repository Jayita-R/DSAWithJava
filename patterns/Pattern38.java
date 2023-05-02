package com.patterns;

/*

A
AB
ABC
ABCD
ABCDE

 */

public class Pattern38 {
    public static void main(String[] args) {
        pattern38(5);
    }
    static void pattern38(int n){
        int alphabet=65;
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print((char)(alphabet+col)+"");
            }
            System.out.println();
        }
    }
}
