package com.basic;

import java.util.ArrayList;

public class PrintAllkSumSubseq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSumSubseq(arr, 0, ds, 2, 0);
    }

    static void printAllSumSubseq(int[] arr, int i, ArrayList<Integer> ds, int k, int sum) {
        if(i==arr.length){
            if(k==sum){
                System.out.println(ds);
            }
            return ;
        }
        //take
        ds.add(arr[i]);
        sum+=arr[i];
        printAllSumSubseq(arr,i+1,ds,k,sum);

        ds.remove(ds.size() - 1);
        sum-=arr[i];
        printAllSumSubseq(arr,i+1,ds,k,sum);
    }
}
