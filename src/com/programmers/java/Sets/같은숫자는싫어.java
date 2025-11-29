package com.programmers.java.Sets;

import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();

        int compare = -1;
        for(int item : arr) {
            if(compare == item) {
                continue;
            }
            compare = item;
            list.add(item);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{4,4,4,3,3};
        System.out.println(s.solution(arr));
    }
}
