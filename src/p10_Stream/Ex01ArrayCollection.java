package p10_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Ex01ArrayCollection {
  public static void main(String[] args) {
    String[] stArr1 = {"abc", "def", "ghi"};
    //배열을 Stream으로 변경
    Stream<String> tmpStream = Arrays.stream(stArr1);
    tmpStream.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });
    String[] stArr2 = {"ABC", "DEF", "GHI"};
    //2개의 배열을 하나의 Stream으로 변경
    Stream<String[]> strArrStream = Stream.of(stArr1, stArr2);
    // 배열 스트림을 String Stream 으로 변경
    Stream<String> strStream = strArrStream.flatMap(
            // String[], String을 상속받은 ? => 객체
            new Function<String[], Stream<? extends String>>() {
              @Override
              public Stream<? extends String> apply(String[] array) {
                return Arrays.stream(array);
              }
            })
        .map(new Function<String, String>() {
          @Override
          public String apply(String s) {
            return s.toLowerCase();
          }
        });
    strStream.distinct()
        .sorted()
        .forEach(new Consumer<String>() {
          @Override
          public void accept(String s) {
            System.out.println(s);
          }
        });

    List<String> list = new ArrayList<>();
    list.add("손흥민");
    list.add("황희찬");
    list.add("황인범");
    list.add("김민재");
    //Stream<String> nameStream = list.stream();
    // ForkJoinPool관리방식을 사용해서 복잡하던 스레드 관리방식을 Fork와 Join을 통해서
    // 분할 정보(Divide and Conquer)기법으로 처리해준다.
    Stream<String> nameStream = list.parallelStream();
    nameStream.forEach(s -> {
      System.out.println(s);
      System.out.println(s.toLowerCase());
    });
  }
}
