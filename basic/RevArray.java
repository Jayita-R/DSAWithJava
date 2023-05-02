package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

     static void rev(int[] nums,int l, int r) {
        if(l>=r)
            return;
        swapEle(nums,l,r);
        rev(nums,l+1,r-1);

    }

    static void swapEle(int[] nums, int l, int r) {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
