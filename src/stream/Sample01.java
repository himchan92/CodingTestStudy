package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sample01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 5);
        System.out.println(list);

        //HashSet 중복제거
        ArrayList<Integer> list2 = new ArrayList<>(new HashSet<>(list));
        list2.forEach(System.out::println);

        //스트림 중복제거
        list.stream().distinct().forEach(System.out::println);
    }
}
