package com.basic;

import java.util.ArrayList;

public class PrintSubseq {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        ArrayList<Integer> ds=new ArrayList<>();
        printSubseq(arr,0,ds);

    }

    static void printSubseq(int[] arr,int i, ArrayList<Integer> ds) {
        if(i== arr.length){
            if(ds.size()>0) {
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr[i]);
        printSubseq(arr,i+1,ds);
        ds.remove(ds.size()-1);
        printSubseq(arr,i+1,ds);
    }


}
