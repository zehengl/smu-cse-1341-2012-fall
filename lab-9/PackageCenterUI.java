import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Formatter;

public class PackageCenterUI extends JFrame {

  private Package activePackage;
  private final String[] packageTypes = { "Select Package Type", "Next Day Package", "3-Day Package" };
  private JComboBox packageTypeComboBox;
  private JTextField weightTextField;
  private JTextArea messageTextArea = new JTextArea();
  private JButton btnNewPackage;
  private JButton btnPackageCost;
  private JButton btnExit;

  public PackageCenterUI() {
    super("Package Center");
    activePackage = null;
    setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

    btnNewPackage = new JButton("New Package");
    NewPackageButtonHandler newPackageButtonHandler = new NewPackageButtonHandler();
    btnNewPackage.addActionListener(new NewPackageButtonHandler());
    add(btnNewPackage);

    packageTypeComboBox = new JComboBox(packageTypes);
    packageTypeComboBox.setEnabled(false);
    packageTypeComboBox.addActionListener(new PackageTypeComboBoxHandler());
    add(packageTypeComboBox);

    JLabel lblWeight = new JLabel("Weight:");
    add(lblWeight);

    weightTextField = new JTextField();
    add(weightTextField);
    weightTextField.setColumns(5);

    btnPackageCost = new JButton("Package Cost");
    btnPackageCost.setEnabled(false);
    btnPackageCost.addActionListener(new PackageCostButtonHandler());
    add(btnPackageCost);

    btnExit = new JButton("Exit");
    btnExit.addActionListener(new ExitButtonHandler());
    add(btnExit);

    messageTextArea = new JTextArea("");
    add(messageTextArea);
    setVisible(true);
  }

  private class NewPackageButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      activePackage = null;
      packageTypeComboBox.setSelectedIndex(0);
      weightTextField.setText("");
      messageTextArea.setText("New Package Requested");
      packageTypeComboBox.setEnabled(true);
      btnNewPackage.setEnabled(false);
    }
  }

  private class PackageTypeComboBoxHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int i = packageTypeComboBox.getSelectedIndex();
      String packageType = packageTypes[i];
      if (packageType == "Select Package Type") {
        messageTextArea.setText("No Package Type Select");
        btnPackageCost.setEnabled(false);
        return;
      }
      if (packageType == packageTypes[1]) {
        activePackage = new NextDayPackage();
        messageTextArea.setText("Next Day Package Selected");
        btnPackageCost.setEnabled(true);
        return;
      }
      if (packageType == packageTypes[2]) {
        activePackage = new ThreeDayPackage();
        messageTextArea.setText("3-Day Package Selected");
        btnPackageCost.setEnabled(true);
        return;
      }
    }
  }

  private class PackageCostButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      String theWeight = weightTextField.getText();
      String packageCostMessage = "";
      double weight = 0.0;
      boolean invalidWeightValue = false;
      try {
        weight = Double.parseDouble(theWeight);
      } catch (NumberFormatException nfe) {
        packageCostMessage = "Invalid weight value entered - " + theWeight;
        invalidWeightValue = true;
      }
      if (!invalidWeightValue) {
        activePackage.setWeight(weight);
        double theCost = activePackage.calculateCost();
        System.out.println(theCost);
        if (theCost < 0) {
          packageCostMessage = "Weight value cannot be negative";
        } else {
          Formatter formatter = new Formatter();
          formatter.format("Package Cost = $%.2f", theCost);
          packageCostMessage = formatter.toString();
        }
      }
      messageTextArea.setText(packageCostMessage);

    }
  }

  private class ExitButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
  }

}
