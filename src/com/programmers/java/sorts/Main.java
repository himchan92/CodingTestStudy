package com.programmers.java.sorts;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        Random r = new Random();
        for(int i = 0; i < 20; i++) {
            list.add(r.nextInt(50));
        }

        list.sort(Comparator.naturalOrder()); //오름차순정렬
        System.out.println(list);

        list.sort(Comparator.reverseOrder()); //내림차순정렬
        System.out.println(list);
    }
}
