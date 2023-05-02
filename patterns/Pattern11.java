package com.patterns;

/*

 * * * * *
  * * * *
   * * *
    * *
     *
 */

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for(int row=n;row>=1;row--){
            for(int s=1;s<=n-row;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
