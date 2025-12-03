package com.programmers.java.inflearn;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arr = text.split(" ");

        String result = "";
        int min = 0;

        min = arr[0].length();
        result = arr[0];
        for(int i = 0; i < arr.length; i++) {

            if(min < arr[i].length()) {
                min = arr[i].length();
                result = arr[i];
            }
        }
        System.out.println(result);
        sc.close();
    }
}
