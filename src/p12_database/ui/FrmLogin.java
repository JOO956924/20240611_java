package p12_database.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin extends FrmBasic{
  private JLabel lbLogin, lbID, lbPass;
  private JTextField tfId;
  private JPasswordField pfPass;
  private JButton btnLogin, btnJoin, btnClose;
  private JPanel pnlCenter, pnlSouth;

  public FrmLogin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    lbLogin = new JLabel("Login");
    lbLogin.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 30));
    lbLogin.setHorizontalAlignment(JLabel.CENTER);
    lbLogin.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
    lbID = new JLabel("Id");
    lbPass = new JLabel("Pass");
    tfId = new JTextField(20);
    pfPass = new JPasswordField(20);
    btnLogin = new JButton("Login");
    btnJoin = new JButton("Join");
    btnClose = new JButton("Close");

    tfId.addActionListener(e -> pfPass.requestFocus());
    pfPass.addActionListener(e -> loginAccess(tfId.getText(),new String(pfPass.getPassword())));
    btnLogin.addActionListener(e -> loginAccess(tfId.getText(),new String(pfPass.getPassword())));
    btnJoin.addActionListener(e -> {
      new FrmJoin("회원가입",500,500);
      dispose();
    });
    btnClose.addActionListener(e -> {
      dispose();
    });
    pnlCenter = new JPanel(new GridLayout(2, 2));
    pnlCenter.setBorder(BorderFactory.createEmptyBorder(0, 30, 20, 30));
    pnlSouth = new JPanel();

  }

  private void loginAccess(String id, String pass) {
    System.out.println("login");
  }

  @Override
  public void arrange() {
    add(lbLogin, "North");
    pnlCenter.add(lbID);
    pnlCenter.add(tfId);
    pnlCenter.add(lbPass);
    pnlCenter.add(pfPass);
    add(pnlCenter, "Center");
    pnlSouth.add(btnLogin);
    pnlSouth.add(btnJoin);
    pnlSouth.add(btnClose);
    add(pnlSouth, "South");
  }

  @Override
  public void inflate() {
    super.inflate();
  }
}
