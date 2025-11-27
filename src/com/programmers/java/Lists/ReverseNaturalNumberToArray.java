package com.programmers.java.Lists;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        String filter = sb.append(n).reverse().toString();
        String[] arr = filter.split("");
        int[] answer = new int[arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}

public class ReverseNaturalNumberToArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(12345).toString());
    }
}