package com.jayita;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr={2,3,4,5,6,7,11,43,87};
        int[] arr={90,88,45,30,11,7,6,2,-3};
        int target=11;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
