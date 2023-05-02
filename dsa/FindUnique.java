package com.dsa;



public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,3,5,2,4,6};
        System.out.println(uniqueEle(arr));
    }

    static int uniqueEle(int[] arr) {
        int un=0;
        for(int n:arr){
            un^=n;
        }
        return un;
    }

}
