package com.List;

import java.util.List;
import java.util.Vector;


//vector is synchronised
public class VectorExample {

    public static void main(String[] args) {

        List<Integer> list = new Vector<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(null);

        System.out.println(list);

    }
}
