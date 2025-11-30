package com.programmers.java.searchs;

public class Main3 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }

    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String s : skill_trees) {
            String result = s.replaceAll("[^" + skill + "]", "");
            if(skill.startsWith(result)) {
                answer++;
            }
        }

        return answer;
    }
}