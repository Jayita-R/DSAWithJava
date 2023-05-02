package com.patterns;

/*

     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalCols = row > n ? 2 * n - row : row;

            int noOfSpaces=n-totalCols;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
