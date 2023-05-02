package com.patterns;

/*

 * * * * *
  * * * *
   * * *
    * *
     *
     *
    * *
   * * *
  * * * *
 * * * * *
 */

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n){
        for(int row=1;row<=2*n;row++){
            int c=row>n?2*n-row:row-1;
            for(int s=1;s<=c;s++){
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            for (int col = 6; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
