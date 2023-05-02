package com.jayita;

import java.util.Scanner;

public class SearchInStrings {

    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target)
                return true;
        }
        return false;
    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        System.out.print("Enter the searched character: ");
        char ch=sc.next().charAt(0);
        System.out.print(search(s,ch));
    }
}
