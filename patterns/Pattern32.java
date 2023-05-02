package com.patterns;

/*

E
D E
C D E
B C D E
A B C D E

 */

public class Pattern32 {
    public static void main(String[] args) {
        pattern32(5);
    }
    static void pattern32(int n){
        int alphabet=69;
        for(int row=0;row<n;row++){
            for(int col=row;col>=0;col--){
                System.out.print((char)(alphabet-col)+" ");
            }
            System.out.println();
        }
    }
}
