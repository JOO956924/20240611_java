package p01_class;

public class Ex02printf {
  public static void main(String[] args) {
    System.out.println(7+7+"7"+7+7);
    System.out.print("새파랗게 젊다는게 한 밑천인데 째째하게 굴지말고 가슴을 쫙 펴라\n");
    System.out.println("내일은 해가 뜬다 내일은 해가 뜬다 내일은 해가 뜬다 내일은 해가 뜬다\n");
    System.out.print("흐린 날도 날이 새면 해가 뜨지 \t 않 더 냐");
    System.out.println();
    System.out.print("사노라면 언젠가는 밝은 날도 오겠지");
    System.out.printf("2 * %d = %d %n", 1, 2);
    System.out.printf("원주율의 파이는 %f",3.141592);
    System.out.println();
    System.out.printf(
        "10진수: %d," +
        " 8진수: %o, " +
            "16진수: %x," +
             " 16진수: %X",
        10,10,10,10);
  }
}
