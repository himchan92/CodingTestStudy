package com.programmers.java.level1;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
