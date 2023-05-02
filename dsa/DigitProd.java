package com.dsa;

public class DigitProd {
    public static void main(String[] args) {
        int n=405;
        System.out.println(digitProd(n));
    }
    static int digitProd(int n) {
        if(n%10==n){
            return n;
        }
        return (n%10)*digitProd(n/10);
    }
}
