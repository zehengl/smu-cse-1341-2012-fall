import javax.swing.JFrame;

public class PackageCenterUITester {
  public static void main(String[] args) {
    PackageCenterUI packageCenterUI = new PackageCenterUI();
    packageCenterUI.setBounds(100, 100, 450, 300);
    packageCenterUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    packageCenterUI.setVisible(true);
  }
}
