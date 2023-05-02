package com.basic;

public class PalindromeRec {
    public static void main(String[] args) {
        String s="MADFSM";
        System.out.println(stringPalin(0,s));
    }

    static boolean stringPalin(int i, String s) {
        int n=s.length();
        if(i>=n/2)
            return true;
        if(s.charAt(i)!=s.charAt(n-i-1))
            return false;
        return stringPalin(i+1,s);
    }
}
