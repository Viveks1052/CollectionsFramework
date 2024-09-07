package com.Set;

import java.util.Set;


//Linked hashSet maintains the insertion order with no duplicate and one null value.
public class LinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> st = new java.util.LinkedHashSet<>();

        st.add(16);
        st.add(12);
        st.add(13);
        st.add(14);
        st.add(15);
        st.add(15);
        st.add(null);


        System.out.println(st);
    }
}
