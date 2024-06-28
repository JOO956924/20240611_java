package p10_Stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex03StreamMidOperator {
  public static void main(String[] args) {
    String dir = "C:\\workspace\\spaceJava\\20240611_java";
    try {
      Stream<Path> fileListStream = Files.list(Paths.get(dir));
      fileListStream.map(new Function<Path, File>() {
            @Override
            public File apply(Path path) {
              return path.toFile();
            }
          })
//          .peek(new Consumer<File>() {
//            @Override
//            public void accept(File f) {
//              System.out.println(f.toString() + ",");
//            }
//          })
          .filter(new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
              File file = (File) o;
              return file.isFile();
            }
          })
          .map(new Function<File, String>() {
            @Override
            public String apply(File file) {
              return file.toString();
            }
          })
          .map(new Function<String, String>() {
            @Override
            public String apply(String s) {
              return s.toUpperCase();
            }
          })
          .distinct()
          .forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
              System.out.println(s);
            }
          });
      ;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}