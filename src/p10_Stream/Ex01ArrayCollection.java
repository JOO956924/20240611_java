package p10_Stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Ex01ArrayCollection {
  public static void main(String[] args) {
    String[] stArr1 = {"abc", "def", "ghi"};
    //배열을 Stream으로 변경
    //Stream<String> tmpStream = Arrays.stream(stArr1);
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
  }
}
