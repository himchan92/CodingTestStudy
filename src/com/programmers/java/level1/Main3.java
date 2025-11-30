package com.programmers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int num : arr) {
            list.add(num);
        }
        list.remove(0);
        list.sort(Comparator.reverseOrder());
        if(list.size() == 0) {
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
