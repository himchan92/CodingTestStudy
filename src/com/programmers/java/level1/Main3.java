package com.programmers.java.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        String[] str = sb.toString().split("");

        int[] answer = new int[str.length];
        for (int i=0; i<str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}