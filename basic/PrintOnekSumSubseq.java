package com.basic;

import java.util.ArrayList;

public class PrintOnekSumSubseq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> ds = new ArrayList<>();
        printOneSumSubseq(arr, 0, ds, 2, 0);
    }

    static boolean printOneSumSubseq(int[] arr, int i, ArrayList<Integer> ds, int k, int sum) {
        if(i==arr.length){
            if(k==sum){
                System.out.println(ds);
                return true;
            }
            return false;
        }
        //take
        ds.add(arr[i]);
        sum+=arr[i];
        if(printOneSumSubseq(arr,i+1,ds,k,sum)==true) return true;

        ds.remove(ds.size() - 1);
        sum-=arr[i];
        if(printOneSumSubseq(arr,i+1,ds,k,sum)==true) return true;

        return false;
    }
}
