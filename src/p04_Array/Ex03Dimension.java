package p04_Array;

public class Ex03Dimension {
  public static void main(String[] args) {
    int[][] arr = new int[3][3];
    arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (j != 0) System.out.print(",");
        sum = sum + arr[i][j];
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    System.out.println(sum);
  }
}
