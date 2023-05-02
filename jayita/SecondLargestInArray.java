package com.jayita;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr={5,5};
        print2largest(arr);

    }
    static void print2largest(int[] arr){
        int i,f,s;
        //There should be atleast 2 elements
        if(arr.length<2){
            System.out.println("Invalid Input");
            return;
        }
        f=arr[0];
        s=arr[1];
        for(i=1;i<arr.length;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }
            else if(arr[i]>s && arr[i]<f || f==s){
                s=arr[i];
            }
        }
        if(f==s)
            System.out.println("All the elements in the input array are same so largest is "+s);
        else
            System.out.println("The second highest element is "+s);


    }
}
