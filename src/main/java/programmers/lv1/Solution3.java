package programmers.lv1;

/**
 * 나머지가 1이 되는 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class Solution3 {

    public static int solution(int n) {
        int answer = 1;

        for(int i = 1; i <= n; i++) {
            if(n % i == 1) {
                answer = i;
                break; //작은 1부터시작해서 조건만족하면 바로 탈출이니 작은수 구하는것
            }

//            if(n % i == 1) {
//                if(answer > i) {
//                    answer = i;
//                }
//            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}