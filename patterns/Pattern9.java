package com.patterns;

/*
 *********
  *******
   *****
    ***
     *
 */

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for(int row=n;row>=1;row--){
            for(int s=1;s<=n-row;s++){
                System.out.print(" ");
            }
            for(int col=2*row-1;col>=1;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
