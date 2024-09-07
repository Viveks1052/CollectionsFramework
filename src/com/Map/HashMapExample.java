package com.Map;

import java.util.HashMap;
import java.util.Map;


//It maintains the natural order of Keys, does not allow duplicate keys but duplicate values are allowed.
public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(5, "Adobe");
        map.put(1,"Apple");
        map.put(2, "Amazon");
        map.put(3, "Google");
        map.put(4, "facebook");
        map.put(6, "facebook");


        System.out.println(map);

        // iterating in hashmap

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key :- "+entry.getKey()+"  value :- "+entry.getValue());
            System.out.println(" ");
        }

    }
}
