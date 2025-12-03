package com.programmers.java.inflearn;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String target = sc.nextLine();

        int count = 0;

        String[] arr = text.split("");
        for(String item : arr) {
            if(item.toUpperCase().equals(target.toUpperCase())) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
