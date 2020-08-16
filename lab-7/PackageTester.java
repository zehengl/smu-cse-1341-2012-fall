import java.util.ArrayList;

public class PackageTester {

  public static void main(String[] args) {
    ExtraService deliveryConfirmation = new ExtraService("Delivery Confirmation", 0.75);
    ExtraService signatureConfirmation = new ExtraService("Signature Confirmation", 1.35);
    ArrayList<ExtraService> extraServices = new ArrayList<ExtraService>();
    extraServices.add(deliveryConfirmation);
    extraServices.add(signatureConfirmation);

    Sender theSender = new Sender("12345678912345", "Lou Brown", "1 Main Street", "Boston", "MA", "02102",
        "617-123-4567");
    Recipient theRecipient = new Recipient("Mary Smith", "7 Elm St", "New York", "NY", "10453", "212-111-1111");
    double theWeight = 8.5;
    double theCostPerOunce = .50;
    double theNextDayFeePerOunce = .25;
    double thePackageValue = 1000.0;

    Package theNextDayPackage = new NextDayPackage(theSender, theRecipient, extraServices, theWeight, theCostPerOunce,
        theNextDayFeePerOunce, thePackageValue);
    System.out.println(theNextDayPackage.prepareMailingLabel());
    System.out.printf("\nCost = %.2f\n\n", theNextDayPackage.calculateCost());

    Package theThreeDayPackage = new ThreeDayPackage(theSender, theRecipient, extraServices, theWeight, theCostPerOunce,
        thePackageValue);
    System.out.println(theThreeDayPackage.prepareMailingLabel());
    System.out.printf("\nCost = %.2f\n\n", theThreeDayPackage.calculateCost());

  }

}
