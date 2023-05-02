package com.basic;

import java.util.Scanner;

public class HeightChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements");
        int n=sc.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int[] exp=new int[heights.length];
        exp=heights;
        for(int j=0;j<exp.length;j++){
            System.out.println(exp[j]);
        }
    }
}
