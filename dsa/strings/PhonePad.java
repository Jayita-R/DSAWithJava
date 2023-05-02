package com.dsa.strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
       //pad("","12");
        //System.out.println(padList("","12"));
        System.out.println(padCount("","12"));
    }
    static void pad(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=u.charAt(0)-'0'; //this will convert '2' to 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,u.substring(1));
        }

    }
    static ArrayList<String> padList(String p, String u){
        if(u.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=u.charAt(0)-'0'; //this will convert '2' to 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(padList(p+ch,u.substring(1)));
        }
        return ans;

    }

    static int padCount(String p,String u){
        if(u.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=u.charAt(0)-'0'; //this will convert '2' to 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count+=padCount(p+ch,u.substring(1));
        }
        return count;
    }
}
