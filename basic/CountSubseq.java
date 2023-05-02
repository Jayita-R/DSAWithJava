package com.basic;

import java.util.ArrayList;

public class CountSubseq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(printCountSubseq(arr, 0, 2, 0));
    }

    static int printCountSubseq(int[] arr, int i, int k, int sum) {
        if(i==arr.length){
            if(k==sum){
                return 1;
            }
            return 0;
        }
        //take

        sum+=arr[i];
        int l=printCountSubseq(arr,i+1,k,sum);

        sum-=arr[i];
        int r=printCountSubseq(arr,i+1,k,sum);

        return l+r;
    }
}
