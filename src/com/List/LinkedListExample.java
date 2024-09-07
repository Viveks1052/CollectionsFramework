package com.List;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// manipulation is fast in linkedList
public class LinkedListExample {

    public static void main(String[] args) {

        List<String>  list = new LinkedList<>();

        list.add("Flipkart");
        list.add("Amazon");
        list.add("Flipkart");
        list.add("Netflix");
        list.add("Google");
        list.add(null);

//        Collections.sort(list);
//
        System.out.println(list);
//
//       List<String> list1 =  list.stream().distinct().collect(Collectors.toList());
//
//        System.out.println(list1);




    }
}
