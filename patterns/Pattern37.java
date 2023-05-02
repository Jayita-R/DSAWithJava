package com.patterns;

/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */

public class Pattern37 {
    public static void main(String[] args) {
        pattern37(5);
    }
    static void pattern37(int n){
        for(int row=1;row<=2*n;row++){
            int c=row>n?row-n-1:n-row;
            for(int s=1;s<=c;s++){
                System.out.print(" ");
            }
            for (int col = 1; col < 2*row; col++) {
                System.out.print("*");
            }
            for (int col = 6; col>=9; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
