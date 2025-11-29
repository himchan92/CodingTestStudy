package com.programmers.java.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1); //큐 등록
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);

        queue.poll(); //앞꺼내기
        System.out.println(queue);
        System.out.println(queue.peek()); //앞요소조회
    }
}
