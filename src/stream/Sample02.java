package stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample02 {
    public static void main(String[] args) {
        //배열
        String[] strArray = {"형님", "타노스", "상도"};
        int[] intArr = {3, 6, 9};
        double[] douArr = {3.1, 3.2, 5.3};

        //스트림 생성
        Stream<String> strStm = Arrays.stream(strArray);
        IntStream intStm = Arrays.stream(intArr);
        DoubleStream douStm = Arrays.stream(douArr);

        //출력
        strStm.forEach(System.out::println);
        intStm.forEach(System.out::println);
        douStm.forEach(System.out::println);
    }
}
