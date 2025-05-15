package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pcnt = 0;
        int ycnt = 0;

        char[] text = s.toCharArray();
        for(char item : text) {
            if(Character.toLowerCase(item) == 'p') {
                pcnt++;
            }
            if(Character.toLowerCase(item) == 'y') {
                ycnt++;
            }
        }

        answer = (pcnt == ycnt) ? true : false;

        return answer;
    }
}

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("pPoooyY"));
    }
}
