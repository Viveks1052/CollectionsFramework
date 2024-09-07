package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {

    public static void main(String[] args) {

//        System.out.println("Vivek");

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

       List<Integer> list1 =  list.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);

        for (int x:list1){
            System.out.print(x);
        }

        System.out.println(" ");

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }


    }
}
