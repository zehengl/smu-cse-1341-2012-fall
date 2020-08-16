import java.util.ArrayList;

public abstract class Package {

  private Sender sender;
  private Recipient recipient;
  private ArrayList<ExtraService> extraServices;
  private double weight;
  private double costPerOunce;
  private double packageValue;

  public Package() {
  }

  public Package(Sender sender, Recipient recipient, ArrayList<ExtraService> extraServices, double weight,
      double costPerOunce, double packageValue) {
    super();
    this.sender = sender;
    this.recipient = recipient;
    this.extraServices = extraServices;
    this.weight = weight;
    this.costPerOunce = costPerOunce;
    this.packageValue = packageValue;
  }

  public abstract double calculateCost();

  public abstract String prepareMailingLabel();

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

  public void setRecipent(Recipient recipient) {
    this.recipient = recipient;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getCostPerOunce() {
    return costPerOunce;
  }

  public void setCostPerOunce(double costPerOunce) {
    this.costPerOunce = costPerOunce;
  }

  public double getPackageValue() {
    return packageValue;
  }

  public void setPackageValue(double packageValue) {
    this.packageValue = packageValue;
  }

  @Override
  public String toString() {
    return "Package [sender=" + sender + ", recipient=" + recipient + ", extraServices=" + extraServices + ", weight="
        + weight + ", costPerOunce=" + costPerOunce + ", packageValue=" + packageValue + "]";
  }

}
