package com.programmers.java.inflearn;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = "";
        char[] ch = text.toCharArray();

        for(char c : ch) {
            if(Character.isUpperCase(c)) {
                result += String.valueOf(Character.toLowerCase(c));
            }
            else {
                result += String.valueOf(Character.toUpperCase(c));
            }
        }
        System.out.println(result);
        sc.close();
    }
}
