package p12_database.ui;

import javax.swing.*;
import java.awt.*;

public class FrmLogin extends FrmBasic {
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
    lbID = new JLabel("Id");
    lbPass = new JLabel("Pass");
    tfId = new JTextField(20);
    pfPass = new JPasswordField(20);
    btnLogin = new JButton("Login");
    btnJoin = new JButton("Join");
    btnClose = new JButton("Close");
    pnlCenter = new JPanel(new GridLayout(2,2));
    pnlSouth = new JPanel();

  }

  @Override
  public void arrange() {
    add(lbLogin,"North");
    pnlCenter.add(lbID);
    pnlCenter.add(tfId);
    pnlCenter.add(lbPass);
    pnlCenter.add(pfPass);
    add(pnlCenter,"Center");
    pnlSouth.add(btnLogin);
    pnlSouth.add(btnJoin);
    pnlSouth.add(btnClose);
    add(pnlSouth,"South");
  }

  @Override
  public void inflate() {
    super.inflate();
  }
}
