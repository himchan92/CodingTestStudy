package programmers.lv1;

/**
 * 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Solution1 {

    public static int[] solution(long n) {
        int index = 0;

        String[] str = String.valueOf(n).split("");
        int[] answer = new int[str.length];

        for(int i = str.length-1; i >= 0; i--) {
            answer[index++] = Integer.parseInt(str[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }
}