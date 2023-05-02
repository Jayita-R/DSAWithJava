package com.basic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(102, "Ishita");
        map.put(103, "Saita");
        map.put(101, "Jayita");
        map.put(105, "Rimita");
        map.put(104, "Saikat");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
