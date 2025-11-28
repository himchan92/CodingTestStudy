package com.programmers.java.Maps;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        String[] party = new String[]{"leo", "kiki", "eden"};
        String[] complete = new String[]{"eden", "kiki"};
        solution(party, complete);
    }

    private static String solution(String[] participant, String[] completion) {
        //정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        //비교해서 다른경우 참가자 x 판별
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        //전부다 같은경우 맨뒤에 참가자가 해당
        return participant[participant.length - 1];
    }
}