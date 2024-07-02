package p12_database.ui;

import p12_database.dao.MembersDAO;
import p12_database.vo.Members;

import javax.swing.*;
import java.awt.*;

public class FrmJoin extends FrmBasic {
  private JLabel lbJoin, lbName, lbId, lbPass, lbMobile;
  private JTextField tfName, tfId, tfMobile;
  private JPasswordField pfPass;
  private JButton btnJoin, btnClose;
  private JPanel pnlCenter, pnlSouth;

  public FrmJoin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    lbJoin = new JLabel("Join");
    lbJoin.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 30));
    lbJoin.setHorizontalAlignment(JLabel.CENTER);
    lbJoin.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
    lbName = new JLabel("이름");
    lbId = new JLabel("ID");
    lbPass = new JLabel("Pass");
    lbMobile = new JLabel("Mobile");
    tfName = new JTextField(20);
    pfPass = new JPasswordField(20);
    tfId = new JTextField(20);
    tfMobile = new JTextField(20);
    btnJoin = new JButton("가입");
    btnClose = new JButton("로그인");

    tfName.addActionListener(e -> {
      if (!isEmptytxt()) tfId.requestFocus();
    });
    tfId.addActionListener(e -> {
      if (!isEmptytxt()) pfPass.requestFocus();
    });
    pfPass.addActionListener(e -> {
      if (!isEmptyPass()) tfMobile.requestFocus();
    });
    tfMobile.addActionListener(
        e -> {
          if (!isEmptytxt() && !isEmptyPass()) {
            //joinAccess
          }
        }
    );

    btnClose.addActionListener(e -> {
      new FrmLogin("Welcom Login",270,200);
      dispose();
    });
    pnlCenter = new JPanel(new GridLayout(4, 2));
    pnlCenter.setBorder(BorderFactory.createEmptyBorder(0, 120, 20, 120));
    pnlSouth = new JPanel();
  }

  private void joinAccess(String name, String id, String pass, String mobile) {

  }

  private boolean isEmptytxt() {
    if (!tfName.getText().toString().trim().equals("")) {
      return false;
    } else if (!tfId.getText().toString().trim().equals("")) {
      return false;
    } else if (!tfMobile.getText().toString().trim().equals("")) {
      return false;
    }
    return true;
  }

  private boolean isEmptyPass() {
    if (!new String(pfPass.getPassword()).toString().trim().equals("")) return false;
    return true;
  }

  @Override
  public void arrange() {
    add(lbJoin, "North");
    pnlCenter.add(lbName);
    pnlCenter.add(tfName);
    pnlCenter.add(lbId);
    pnlCenter.add(tfId);
    pnlCenter.add(lbPass);
    pnlCenter.add(pfPass);
    pnlCenter.add(lbMobile);
    pnlCenter.add(tfMobile);
    add(pnlCenter, "Center");
    pnlSouth.add(btnJoin);
    pnlSouth.add(btnClose);
    add(pnlSouth, "South");

  }
}
