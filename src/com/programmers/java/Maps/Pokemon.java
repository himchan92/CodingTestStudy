package com.programmers.java.Maps;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int size = nums.length / 2;
        int filter = set.size();

        return Math.min(size, filter);
    }
}

public class Pokemon {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{3, 1, 2, 3};
        System.out.println(s.solution(nums));

        int[] nums2 = new int[]{3,3,3,2,2,4};
        System.out.println(s.solution(nums2));

        int[] nums3 = new int[]{3,3,3,2,2,2};
        System.out.println(s.solution(nums3));
    }
}
