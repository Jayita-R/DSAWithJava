package com.jayita;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=2,flag=0;
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Not a prime nor a composite number");
            flag=1;
        }
        else {

            while (i*i <= num) {
                if (num % i == 0) {
                    System.out.println(num + " is not a Prime number");
                    flag = 1;
                    break;
                } else
                    i++;
            }
        }
        if(flag==0) {
            System.out.println(num + " is a Prime number");
        }


    }
}
