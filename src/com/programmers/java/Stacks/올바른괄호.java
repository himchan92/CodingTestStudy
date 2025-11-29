package com.programmers.java.Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        Stack<String> stack = new Stack<>();

        for(String item: str) {
            if(item.equals("(")) {
                stack.push(item);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}

public class 올바른괄호 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("(())()"));
    }
}
