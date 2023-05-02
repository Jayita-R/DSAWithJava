package com.patterns;

/*
1
22
333
4444
55555
 */

public class Pattern35 {
    public static void main(String[] args) {
        pattern35(5);
    }


        static void pattern35(int n){
            for(int row=1;row<=n;row++){
                for(int col=1;col<=row;col++){
                    System.out.print(row);
                }
                System.out.println();
            }
        }
}
