package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Solution5 {

    public static long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        for(String item : arr) {
            sb.append(item);
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
