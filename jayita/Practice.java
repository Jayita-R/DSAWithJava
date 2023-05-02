package com.jayita;

import java.util.Scanner;

public class Practice {
    static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n=0;
        for(int i=0,j=0;i<startTime.length && j<endTime.length;i++,j++){
            if(startTime[i]<=queryTime && queryTime<=endTime[j])
                n++;
        }
        return n;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr1=new int[m];
        for(int j=0;j<m;j++){
            arr1[j]=sc.nextInt();
        }
        int qTime=sc.nextInt();
        busyStudent(arr,arr1,qTime);
    }

}

