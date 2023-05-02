package com.dsa;

public class SumRecursion {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumRec(n));
    }

    static int sumRec(int n) {
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
}
