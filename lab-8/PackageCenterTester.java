
public class PackageCenterTester {

  public static void main(String[] args) {

    PackageCenter pc = new PackageCenter();

    pc.welcome();

    while (pc.askForPackageType()) {
      pc.askForPackageWeightNValue();
      pc.askForSenderInformation();
      pc.askForRecipientInformation();
      pc.selectServices();
      pc.printMailingLabel();
    }

    pc.thankYouForYourBusiness();
  }
}
