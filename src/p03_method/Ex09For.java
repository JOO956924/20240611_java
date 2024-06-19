package p03_method;

import javax.swing.*;

public class Ex09For {
  public static void main(String[] args) {
    //int sum = 0;
    /*String input = JOptionPane.showInputDialog("구구단:");
    int sum = Integer.parseInt(input);*/

    // for (int i = 9; i >= 0; --i) {
    // 반복문을 구현할 때
    // 첫번째 패턴을 찾아라
    // 초기값,조건,증감 적용
    //
    // sum = sum + i;
    for (int k = 0; k < 3; k++) {
      for (int j = 1; j < 10; j++) {
        for (int i = 2; (i+k) < 10; i += 3) {

          System.out.printf("%d * %d = %2d \t", i+k, j, (i + k) * j);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}


