package p03_method;

import javax.swing.*;

public class Ex10while {
  public static void main(String[] args) {
    /*int i = 0;
    int sum = 0;*/
    int i = 1;
    int sum = 2;
    while (i < 10) {
      sum = 2;

      while (sum < 10) {
        System.out.printf("%d * %d = %2d\t", sum, i, sum * i);
        sum++;
      }
      System.out.println();
      i++;

    }

    System.out.println("==========내 마음의 숫자를 맞춰봐(1~100)==========");
    boolean stop = false;
    while (true) {
      int random = (int) (Math.random() * 100) + 1;
      System.out.println(random);
      if (stop) {
        break;
      }
      while (true) {
        String input = JOptionPane.showInputDialog("숫자를 입력하세요(종료하려면 Q,q)");
        if (input.toLowerCase().equals("q")) {
          stop = true;
          break;
        } else {
          int answer = Integer.parseInt(input);
          if (random > answer) {
            System.out.println("작습니다");
          } else if (random < answer) {
            System.out.println("큽니다");
          } else {
            System.out.println("정답입니다");
          }
        }
      }

      do {

      } while (true);
    }
  }
}
