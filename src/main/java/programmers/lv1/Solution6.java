package programmers.lv1;

import java.util.Arrays;

/**
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class Solution6 {

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers) {
            answer -= i;
        }

        return answer;

        // 다른풀이법:  return 45 - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,6,7,8};
        System.out.println(solution(arr));
    }
}