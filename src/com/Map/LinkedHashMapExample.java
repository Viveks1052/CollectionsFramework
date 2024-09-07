package com.Map;

import java.util.*;



//it  maintains the insertion order
public class LinkedHashMapExample {

    public static void main(String[] args) {

         Map<Integer, String> linkedhashmap = new LinkedHashMap<>();

        linkedhashmap.put(5, "Adobe");
        linkedhashmap.put(1,"Apple");
        linkedhashmap.put(2, "Amazon");
        linkedhashmap.put(3, "Google");
        linkedhashmap.put(4, "facebook");
        linkedhashmap.put(6, "facebook");

        System.out.println(linkedhashmap);

    }
}
