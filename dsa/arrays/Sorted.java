package com.dsa.arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,16,8};
        System.out.println(sortedArray(arr,0));
    }
    static boolean sortedArray(int[] a,int index){
        if(index==a.length-1){
            return true;
        }
        return a[index]<a[index+1] && sortedArray(a,index+1);
    }
}
