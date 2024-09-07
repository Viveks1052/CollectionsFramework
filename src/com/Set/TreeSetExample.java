package com.Set;

import java.util.Set;
import java.util.TreeSet;


// It maintains the natural order and does not allow duplictes and null value.
public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>();

        st.add(16);
        st.add(12);
        st.add(13);
        st.add(14);
        st.add(15);
        st.add(15);
//        st.add(null);

        System.out.println(st);
    }
}
