package com.patterns;
/*

E D C B A
D C B A
C B A
B A
A

 */
public class Pattern34 {
    public static void main(String[] args) {
        pattern34(5);
    }
    static void pattern34(int n){
        int alphabet=69;
        for(int row=0;row<n;row++){
            for(int col=row;col<n;col++){
                System.out.print((char)(alphabet-col)+" ");
            }
            System.out.println();
        }
    }
}
