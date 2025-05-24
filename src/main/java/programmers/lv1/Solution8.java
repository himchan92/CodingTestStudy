package programmers.lv1;

/**
 * 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */
public class Solution8 {
    public static String solution(String phone_number) {
        /**
         * 다른 풀이법1
         *      char[] ch = phone_number.toCharArray();
         *      for(int i = 0; i < ch.length - 4; i ++){
         *          ch[i] = '*';
         *      }
         *      return String.valueOf(ch);
         *
         * 다른 풀이법2
         *      return phone_number.replaceAll(".(?=.{4})", "*");
         */

        String answer = "";

        String[] arr = phone_number.split("");

        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length - 4) {
                answer += "*";
            }
            else {
                answer += arr[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("027778888"));
    }
}
