package com.programmers.java.searchs;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String[] phone_book = new String[]{"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phoneBook) {
        boolean answer = true;

        Arrays.sort(phoneBook);

        for(int i = 1; i < phoneBook.length; i++) {
            if(phoneBook[i].startsWith(phoneBook[i-1])) {
                return false;
            }
        }

        return answer;
    }
}