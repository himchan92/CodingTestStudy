package com.programmers.java.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(extracted(text));;

        sc.close();
    }

    private static String extracted(String text) {
        String answer = "YES";

        Stack<String> stack = new Stack<>();
        for(String item : text.split("")) {
            if(item.equals("(")) {
                stack.push(item);
            }
            else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}
