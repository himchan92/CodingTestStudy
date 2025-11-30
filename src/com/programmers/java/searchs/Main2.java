package com.programmers.java.searchs;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution("Pyy"));
    }

    private static boolean solution(String s) {

        int pCnt = 0;
        int yCnt = 0;

        String[] str = s.split("");
        for(String item : str) {
            if(item.toUpperCase().equals("P")) {
                pCnt++;
            }
            else if(item.toUpperCase().equals("Y")) {
                yCnt++;
            }
        }

        return (pCnt == yCnt);
    }
}