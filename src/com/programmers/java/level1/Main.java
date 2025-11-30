package com.programmers.java.level1;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    public static int solution(int n) {
        int answer = 0;

        String[] str = String.valueOf(n).split("");

        for(String item : str) {
            answer += Integer.parseInt(item);
        }

        return answer;
    }
}
