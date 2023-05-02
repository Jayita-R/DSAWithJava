package com.dsa.arrays;

import java.util.ArrayList;

public class FindElements {
    public static void main(String[] args) {
        int[] arr={3,2,7,1,9,4,11,12,9,61,5};
        int target=9;
       // System.out.println(searchEle(arr,target,0));
        //System.out.println(findIndex(arr,target,0));
       //System.out.println(findIndexLast(arr,target,arr.length-1));
       // findAllIndex(arr,target,0);
        //System.out.print(list);
        //System.out.println(findAllIndexRet(arr,target,0,new ArrayList<>()));
        System.out.println(findAllIndexRet2(arr,target,0));
    }
    static boolean searchEle(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || searchEle(arr,target,index+1);
    }
    static int findIndex(int[] arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    static int findIndexLast(int[] arr,int target,int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
   static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndexRet(int[] arr,int target,int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexRet(arr, target, index + 1,list);
    }

    static ArrayList<Integer> findAllIndexRet2(int[] arr,int target,int index) {

        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIndexRet2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }


}
