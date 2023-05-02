package com.dsa;

public class NoToOne {
    public static void main(String[] args) {
        func(5);
        //funcRev(5);
        //funcBoth(5);
    }

    static void func(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        func(n-1);
    }
    static void funcRev(int n) {
        if(n==0){
            return;
        }
        funcRev(n-1);
        System.out.print(n+" ");
    }
    static void funcBoth(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funcBoth(n-1);
        System.out.print(n+" ");
    }

}
