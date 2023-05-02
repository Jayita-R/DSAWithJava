package com.basic;

import java.util.*;
class RevSolution {
    public void reverseString(char[] s) {
        for(int i=s.length-1;i>=0;i--)
            System.out.print(s[i]+" ");

    }
}
class RevString{
    public static void main(String args[]){
        RevSolution s=new RevSolution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int n=sc.nextInt();
        System.out.print("Enter array elements:");
        char[] carr=new char[n];
        for(int i=0;i<n;i++){
            carr[i]=sc.next().charAt(0);

        }
        s.reverseString(carr);

    }
}
