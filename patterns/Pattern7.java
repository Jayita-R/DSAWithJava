package com.patterns;

/*
 * * * * *
   * * * *
     * * *
       * *
         *
 */

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            for(int s=2;s<=row;s++){
                System.out.print("  ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
