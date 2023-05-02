package com.basic;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"Jayita");
        map.put(101,"Ishita");
        map.put(102,"Tamalika");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
