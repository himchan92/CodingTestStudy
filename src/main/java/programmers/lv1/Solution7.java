package programmers.lv1;

import java.util.stream.Collectors;

/**
 * 문자열 다루기 기본
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */
public class Solution7 {

    public static boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();

        if(s.length() == 4 || s.length() == 6) {
            for(char i : c) {
                if(!Character.isDigit(i)) {
                    answer = false;
                }
            }
        }
        else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }
}
