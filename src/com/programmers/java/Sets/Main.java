package com.programmers.java.Sets;

import java.util.LinkedList;
import java.util.List;

//Set : 중복x, 순서보장x
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if(!list.contains(1))
            list.add(1);

        System.out.println(list);
    }
}