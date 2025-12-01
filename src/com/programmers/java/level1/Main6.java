package com.programmers.java.level1;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        for(int i = 0; i < arr.length-4; i++) {
            arr[i] = "*";
        }

        return String.join("", arr);
    }
}
