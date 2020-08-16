import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PackageCenter {

  private Package activePackage;
  private ArrayList<String> serviceName;
  private ArrayList<Double> serviceCost;

  public PackageCenter() {

    this.serviceName = new ArrayList<String>();
    this.serviceCost = new ArrayList<Double>();

    Scanner input = null;
    try {
      input = new Scanner(new File("ExtraService.config"));

      input.useDelimiter(",");
    } catch (FileNotFoundException fnfe) {
      System.out.println("Cannot find ExtraService.config");
      System.exit(0);
    }
    String theServiceName;
    double theServiceCost;
    while (input.hasNext()) {
      theServiceName = input.next();
      theServiceCost = input.nextDouble();
      this.serviceName.add(theServiceName.trim());
      this.serviceCost.add(theServiceCost);

    }
    input.close();
    this.activePackage = null;
  }

  public void welcome() {
    System.out.println("Welcome to CSE Package Center\n");
  }

  public boolean askForPackageType() {
    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.println("Select Package Type:");
      System.out.println("  1. Next Day Package");
      System.out.println("  2. 3-Day Package");
      System.out.println("  3. Shutdown/Exit Processing");
      int packageType = s.nextInt();
      System.out.println("");

      if (packageType == 1) {
        NextDayPackage nextDayPackage = new NextDayPackage();
        activePackage = nextDayPackage;
        return true;
      } else if (packageType == 2) {
        ThreeDayPackage threeDayPackage = new ThreeDayPackage();
        activePackage = threeDayPackage;
        return true;
      } else if (packageType == 3) {
        System.out.println(" ");

        return false;
      }
    }
  }

  public void askForPackageWeightNValue() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Package Weight/Value:");

    System.out.print("  Weight: ");
    double packageWeight = s.nextDouble();
    this.activePackage.setWeight(packageWeight);
    System.out.println("");

    System.out.print("  Value: ");
    double packageValue = s.nextDouble();
    this.activePackage.setPackageValue(packageValue);
    System.out.println("");

  }

  public void askForSenderInformation() {
    Scanner s = new Scanner(System.in);
    s.useDelimiter(System.getProperty("line.separator"));

    System.out.println("Enter Sender Information:");

    System.out.print("\n  Account Id : ");
    String accountId = s.next();

    System.out.print("\n  Name : ");
    String name = s.next();

    System.out.print("\n  Address: ");
    String address = s.next();

    System.out.print("\n  City: ");
    String city = s.next();

    System.out.print("\n  State: ");
    String state = s.next();

    System.out.print("\n  Zip Code: ");
    String zipCode = s.next();

    System.out.print("\n  Phone Number: ");
    String phoneNumber = s.next();
    System.out.println("");

    Sender sender = new Sender(accountId, name, address, city, state, zipCode, phoneNumber);
    this.activePackage.setSender(sender);
  }

  public void askForRecipientInformation() {
    Scanner s = new Scanner(System.in);
    s.useDelimiter(System.getProperty("line.separator"));

    System.out.println("Enter Recipient Information:");
    System.out.print("\n  Name : ");
    String name = s.next();

    System.out.print("\n  Address: ");
    String address = s.next();

    System.out.print("\n  City: ");
    String city = s.next();

    System.out.print("\n  State: ");
    String state = s.next();

    System.out.print("\n  Zip Code: ");
    String zipCode = s.next();

    System.out.print("\n  Phone Number: ");
    String phoneNumber = s.next();
    System.out.println("");

    Recipient recipient = new Recipient(name, address, city, state, zipCode, phoneNumber);
    this.activePackage.setRecipient(recipient);
  }

  public void selectServices() {
    Scanner s = new Scanner(System.in);
    System.out.println("Select Services:");
    int servicesLoop;
    if (serviceName.size() <= serviceCost.size()) {
      servicesLoop = serviceName.size();
    } else {
      servicesLoop = serviceCost.size();
    }
    for (int i = 0; i < servicesLoop; i++) {
      int sL = i + 1;
      System.out.println("  " + sL + ". " + this.serviceName.get(i) + " - $" + this.serviceCost.get(i));
    }
    int serviceType = s.nextInt();
    serviceType--;
    System.out.println("");

    if (serviceType < 0 || serviceType >= serviceName.size()) {
    } else {
      String serviceName = this.serviceName.get(serviceType);
      double serviceCost = this.serviceCost.get(serviceType);

      ExtraService extraService = new ExtraService(serviceName, serviceCost);
      activePackage.getExtraServices().add(extraService);

    }
  }

  public void printMailingLabel() {
    activePackage.printMailingLabel();

    System.out.printf("Package Cost =  %.2f\n\n", activePackage.calculateCost());
    System.out.println("");
  }

  public void thankYouForYourBusiness() {
    System.out.println("\nThank You For Your Business");
  }

  @Override
  public String toString() {
    return "PackageCenter [activePackage=" + activePackage + ", serviceName=" + serviceName + ", serviceCost="
        + serviceCost + "]";
  }

}
