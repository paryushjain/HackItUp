package com.coding.companies.ey;

import java.util.*;
class Geek {
    String name;
    int id;
    Geek(String name, int id) {
 
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
    @Override
    public int hashCode() {
        return 1;
    }
 
}
public class Sample2 {
    public static void main(String[] args) {
 
        // creating two Objects with
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 2);
        Geek g3 = new Geek("aditya", 3);
 
        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
        map.put(g3, "CSE");
        System.out.println(map.size());
 
        for (Geek geek : map.keySet()) {
            System.out.println(map.get(geek).toString());
        }
 
    }
}
 