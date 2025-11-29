package com.programmers.java.Stacks;

import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        System.out.println(deque); //1

        deque.offerLast(2); //뒤에서 넣기
        System.out.println(deque); //1, 2

        deque.offerFirst(3); //앞에서 넣기
        System.out.println(deque); //3, 1, 2
    }
}
