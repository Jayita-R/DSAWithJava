package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class RevArray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev2(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    static void rev2(int[] nums,int i) {
        int n=nums.length;
        if(i>=n/2)
            return;
        swapEle(nums,i,n-i-1);
        rev2(nums,i+1);

    }

    static void swapEle(int[] nums, int i1, int i2) {
        int temp=nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=temp;
    }
}
