package com.dsa.strings;

public class Stream {
    public static void main(String[] args) {
         //skip("","baccadh");
        System.out.println(skipAppNotApple("bacappcadh"));
    }
    static void skip(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=u.charAt(0);
        if(ch=='a'){
            skip(p,u.substring(1));
        }else{
            skip(p+ch,u.substring(1));
        }
    }

    static String skip(String u){
        if(u.isEmpty()){
            return "";
        }
        char ch=u.charAt(0);
        if(ch=='a'){
            return skip(u.substring(1));
        }else{
            return ch+skip(u.substring(1));
        }
    }
    static String skipApple(String u){
        if(u.isEmpty()){
            return "";
        }

        if(u.startsWith("apple")){
            return skipApple(u.substring(5));
        }else{
            return u.charAt(0)+skipApple(u.substring(1));
        }
    }

    static String skipAppNotApple(String u){
        if(u.isEmpty()){
            return "";
        }

        if(u.startsWith("app") && !u.startsWith("apple")){
            return skipAppNotApple(u.substring(3));
        }else{
            return u.charAt(0)+skipAppNotApple(u.substring(1));
        }
    }
}
