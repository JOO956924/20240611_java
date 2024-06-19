package p03_method;

import javax.swing.*;

public class Ex10whileb {
  public static void main(String[] args) {
    System.out.println("==========내 마음의 숫자를 맞춰봐(1~100)==========");

      int random = (int) (Math.random() * 100) + 1;
      System.out.println(random);
      while (true) {
        int answer = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요(종료하려면 Q,q)"));
          if (random > answer) {
            System.out.println("작습니다");
          } else if (random < answer) {
            System.out.println("큽니다");
          } else {
            System.out.println("정답입니다");
            break;
          }
        }
      }
    }


