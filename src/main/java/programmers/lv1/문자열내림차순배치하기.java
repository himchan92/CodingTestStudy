package programmers.lv1;

public class 문자열내림차순배치하기 {
    public static String Reverse(String s) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        answer = sb.append(s).reverse().toString();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Reverse("Zbcdefg"));
    }
}
