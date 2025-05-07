package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
    자릿수 뒤집어 배열로 만들기
    - https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static int[] solution(long n) {
        String[] data = String.valueOf(n).split("");
        List<String> list = Arrays.asList(data);
        Collections.reverse(list);

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
}
