package com.Set;

import java.net.Inet4Address;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//HashSet does not maintain insertion pattern and does not allow duplicates and only one null value.
public class HashSetExample {

    public static void main(String[] args) {
         Set<Integer> st = new HashSet<>();

         st.add(10);
        st.add(12);
        st.add(14);
        st.add(16);
        st.add(11);
        st.add(10);
        st.add(null); // it allows only one null values as it internally uses Hashmap.

        System.out.println(st);

        List<Integer> st1 = st.stream().collect(Collectors.toList());

//        Collections.sort(st1);
        System.out.println(st1);


    }
}
