package programmers.lv1;

/**
 * x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Solution2 {
    public static long[] solution(int x, int n) {
        long num = 0; //long 타입인경우 int 아닌 long형으로 반환 (int반환 실수 주의..)
        long[] answer = new long[n];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = (num += x);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 5));
    }
}