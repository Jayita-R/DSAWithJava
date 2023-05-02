package com.patterns;

/*
ABCDE
ABCD
ABC
AB
A
 */

public class Pattern39 {
    public static void main(String[] args) {
        pattern38(5);
    }
    static void pattern38(int n){
        int alphabet=65;
        for(int row=n;row>0;row--){
            for(int col=0;col<row;col++){
                System.out.print((char)(alphabet+col)+"");
            }
            System.out.println();
        }
    }
}
