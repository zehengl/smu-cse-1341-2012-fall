import java.util.ArrayList;
import java.util.Formatter;
import java.io.FileNotFoundException;

public abstract class Package {

  private Sender sender;
  private Recipient recipient;
  private ArrayList<ExtraService> extraServices;
  private double weight;
  private double costPerOunce;
  private double packageValue;
  private final double COST_PER_OUNCE = 0.50;
  private final String FILE_NAME = "CSE_MailingLabel_";
  private final String FILE_TYPE = "txt";
  private static int mailingLabelIndex = 1;

  public Package() {
    super();
    this.sender = new Sender();
    this.recipient = new Recipient();
    this.extraServices = new ArrayList<ExtraService>();
    this.weight = 0.0;
    this.costPerOunce = this.COST_PER_OUNCE;
    this.packageValue = 0.0;
  }

  public abstract double calculateCost();

  public abstract String prepareMailingLabel();

  public void printMailingLabel() {
    try {
      Formatter mailingLabelFile = new Formatter(this.getNewFileName());
      mailingLabelFile.format(prepareMailingLabel());
      mailingLabelFile.close();
    } catch (FileNotFoundException e) {
      System.out.println("Cannot open mailing label file");
    }

  }

  public ArrayList<ExtraService> getExtraServices() {
    return extraServices;
  }

  public void setExtraServices(ArrayList<ExtraService> extraServices) {
    this.extraServices = extraServices;
  }

  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  public Recipient getRecipient() {
    return recipient;
  }

  public void setRecipient(Recipient recipient) {
    this.recipient = recipient;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getCostPerOunce() {
    return this.costPerOunce;
  }

  public double getPackageValue() {
    return packageValue;
  }

  public void setPackageValue(double packageValue) {
    this.packageValue = packageValue;
  }

  private String getNewFileName() {
    String theNewFileName = this.FILE_NAME + mailingLabelIndex + "." + this.FILE_TYPE;
    mailingLabelIndex = mailingLabelIndex + 1;
    return theNewFileName;
  }

  @Override
  public String toString() {
    return "Package [sender=" + sender + ", recipient=" + recipient + ", extraServices=" + extraServices + ", weight="
        + weight + ", costPerOunce=" + costPerOunce + ", packageValue=" + packageValue + "]";
  }

}
