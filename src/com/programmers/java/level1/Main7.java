package com.programmers.java.level1;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        String result = "";
        String[] answer = s.split("");
        int divide = s.length();
        int index = divide / 2;

        if(divide % 2 == 0) {
            result = s.substring(index - 1, index + 1);
        }
        else {
            result += s.substring(index, index + 1);
        }

        return result;
    }
}
