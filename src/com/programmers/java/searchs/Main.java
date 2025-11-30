package com.programmers.java.searchs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for(int i = 1; i <= 100; i++) {
            list.add(i);
        }

        System.out.println(list);

        int index = list.indexOf(63);
        int filter = Collections.binarySearch(list, 63);
        System.out.println(index);
        System.out.println(list.get(index));
    }
}