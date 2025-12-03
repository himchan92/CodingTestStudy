package com.programmers.java.inflearn;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] key = new int[num];

        for(int i = 0; i < num; i++) {
            key[i] = sc.nextInt();
        }

        int count = 1;
        int first = key[0];

        for(int i = 1; i < key.length; i++) {
            if(key[i] <= first) {
                continue;
            }
            first = key[i];
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
