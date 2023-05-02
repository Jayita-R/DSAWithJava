package com.jayita;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr={-1,-29,0,-4,80};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
