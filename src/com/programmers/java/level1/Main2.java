package com.programmers.java.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;
        String text = "";

        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Comparator.reverseOrder());

        for(String item : str) {
            text += item;
        }

        answer = Long.parseLong(text);

        return answer;
    }
}