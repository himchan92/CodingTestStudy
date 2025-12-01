package com.programmers.java.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            set.add(i);
        }

        for(int j = 0; j < numbers.length; j++) {
            set.remove(numbers[j]);
        }

        for(int num : set) {
            answer += num;
        }

        return answer;
    }
}