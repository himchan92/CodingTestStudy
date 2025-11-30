package com.programmers.java.level1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(2, 5));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long j = x;
        for(int i = 0; i < n; i++) {
            answer[i] = j;
            j+=x;
        }

        return answer;
    }
}
