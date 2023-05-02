package com.jayita;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c)
                max=a;
            else
                max=c;
        }
        else{
            if(b>c)
                max=b;
            else
                max=c;
        }
        System.out.println("Largest number is "+max);
    }
}
