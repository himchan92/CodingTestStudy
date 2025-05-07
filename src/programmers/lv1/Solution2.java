package programmers.lv1;

/*
    자릿수 더하기
    - https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(solution(987));
    }

    public static int solution(int n) {
        int answer = 0;

        String[] target = String.valueOf(n).split("");
        for(String item : target) {
            answer += Integer.parseInt(item);
        }

        return answer;
    }
}
