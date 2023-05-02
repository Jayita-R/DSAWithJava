package com.jayita;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void revArray(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the no of elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        revArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
