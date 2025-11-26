package com.programmers.java;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1, 5); //인덱스1위치에 5넣고 기존항목은 뒤로밀려남
        list.remove(2); //인덱스2위치 값 제거

        System.out.println(list.contains(5)); //5인 값이 존재하는지 여부
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}