package com.programmers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 36, 1, 3};
        System.out.println(solution(arr, 1));
    }

    public static int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();

        for(int item : arr) {
            if(item % divisor == 0) {
                list.add(item);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        Arrays.sort(result);

        return result;
    }
}
