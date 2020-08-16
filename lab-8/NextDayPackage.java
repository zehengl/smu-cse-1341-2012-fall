//import java.util.ArrayList;

public class NextDayPackage extends Package {

  private double nextDayFeePerOunce;
  private final double NEXT_DAY_FEE_PER_OUNCE = 0.25;

  public NextDayPackage() {
    super();
    nextDayFeePerOunce = this.NEXT_DAY_FEE_PER_OUNCE;
  }

  public double calculateCost() {
    double cost = this.getWeight() * (this.getCostPerOunce() + this.nextDayFeePerOunce);
    for (int i = 0; i < this.getExtraServices().size(); i++) {
      cost = cost + this.getExtraServices().get(i).getCost();
    }

    return cost;
  }

  public String prepareMailingLabel() {
    String mailingLabel = "Next Day Package \n\n";
    mailingLabel += "  From: \n";
    mailingLabel += "    " + this.getSender().getName() + "\n";
    mailingLabel += "    " + this.getSender().getAddress() + "\n";
    mailingLabel += "    " + this.getSender().getCity() + ", " + this.getSender().getState() + "  "
        + this.getSender().getZipCode() + "\n";
    mailingLabel += "      \n";
    mailingLabel += "  To: \n";
    mailingLabel += "    " + this.getRecipient().getName() + "\n";
    mailingLabel += "    " + this.getRecipient().getAddress() + "\n";
    mailingLabel += "    " + this.getRecipient().getCity() + ", " + this.getRecipient().getState() + "  "
        + this.getRecipient().getZipCode() + "\n";

    return mailingLabel;
  }

  public double getNextDayFeePerOunce() {
    return this.nextDayFeePerOunce;
  }

  @Override
  public String toString() {
    return "NextDayPackage [nextDayFeePerOunce=" + nextDayFeePerOunce + ", calculateCost()=" + calculateCost()
        + ", prepareMailingLabel()=" + prepareMailingLabel() + ", getExtraServices()=" + getExtraServices()
        + ", getSender()=" + getSender() + ", getRecipient()=" + getRecipient() + ", getWeight()=" + getWeight()
        + ", getCostPerOunce()=" + getCostPerOunce() + ", getPackageValue()=" + getPackageValue() + ", toString()="
        + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
  }

}
