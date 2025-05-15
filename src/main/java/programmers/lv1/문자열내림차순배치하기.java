package programmers.lv1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12917
import java.util.Arrays;

public class 문자열내림차순배치하기 {
    public static String Reverse(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        Arrays.sort(ch); // 대소문자 구분 정렬지원
        answer = sb.append(ch).reverse().toString(); //Builder 제공 역순 기능, 문자열작업 시 StringBuilder 효율있음

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Reverse("Zbcdefg"));
    }
}
