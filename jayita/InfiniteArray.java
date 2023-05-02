package com.jayita;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170,190,199,209,220,240,251,269,286,291,297,305,309,310};
        int target=90;
        int pos=ans(arr,target);
        System.out.println(pos);
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        int val = arr[0];
        while(target>val){
            start = end;
            end = 2 * end;
            val = arr[end];
        }
        /*while(target>arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }*/
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
