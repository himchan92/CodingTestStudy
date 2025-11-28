package com.programmers.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.remove("B"); //해당 키있는 데이터 삭제
        System.out.println(map);
        System.out.println(map.get("A")); //해당 키에 대한 값 출력(없으면 null)
        System.out.println(map.getOrDefault("C", -1)); //get과 유사하나 없는경우 값 설정가능(-1)
    }
}
