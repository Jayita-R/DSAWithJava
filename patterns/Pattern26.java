package com.patterns;

/*

1 1 1 1 1 1
2 2 2 2 2
3 3 3 3
4 4 4
5 5
6

 */

public class Pattern26 {
    public static void main(String[] args) {
        pattern26(6);
    }
    static void pattern26(int n){
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print(row+" ");
            }
            System.out.println();

        }
    }
}
