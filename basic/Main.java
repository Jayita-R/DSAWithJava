package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        int rem=0;
        for(int i=left;i<=right;i++){
            int num=i;
            while(i!=0){
                rem=i%10;
                if(i%rem==0)
                    i=i/10;

            }
            list.add(num);

        }
        return list;
    }
}
public class Main{
    public static void main(String[] args){
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        int left=sc.nextInt();
        int right=sc.nextInt();
        s.selfDividingNumbers(left,right);


    }
}
