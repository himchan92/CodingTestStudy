package programmers.lv1;

public class Solution4 {

    public static long solution(int a, int b) {
        long answer = 0;

        /**
         * 다른 풀이법
         * Math.min, Math.max 함수로 파라미터값 중 최대, 최소 구해 for문 돌리기
         * for문안 변수를 삼항연산자로 하여 간결하게 돌리기
         */

        if(a > b) {
            for(long i = (long)a; i >= (long)b; i--) {
                answer += i;
            }
        }
        else {
            for(long i = (long)a; i <= (long)b; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }
}
