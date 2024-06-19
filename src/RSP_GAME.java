import javax.swing.*;

public class RSP_GAME {
  public static void main(String[] args) {
    System.out.println("==========가위바위보==========");


    do {
      int you = (int) (Math.random() * 3);
      System.out.println(you);
      String input = JOptionPane.showInputDialog("가위(0),바위(1),보(2)중에 입력하세요");
      int me ;
        try {
          me = Integer.parseInt(input);
          if (me-you == -1) {
            System.out.println("졌습니다");
          } else if (me-you == 2) {
            System.out.println("졌습니다");
          } else if (me-you == 0) {
            System.out.println("비겼습니다");
          } else if (me-you == 1) {
            System.out.println("이겼습니다");
          } else if (me-you == -2) {
            System.out.println("이겼습니다0");
          }
        } catch (NumberFormatException e) {
          continue;
        }
    } while (true);


  }
}

