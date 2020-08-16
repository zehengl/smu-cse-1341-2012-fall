public class ExtraService {

  private String extraServiceName;
  private double cost;

  public ExtraService() {
  }

  public ExtraService(String extraServiceName, double cost) {
    super();
    this.extraServiceName = extraServiceName;
    this.cost = cost;
  }

  public String getExtraServiceName() {
    return extraServiceName;
  }

  public void setExtraServiceName(String extraServiceName) {
    this.extraServiceName = extraServiceName;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "ExtraService [extraServiceName=" + extraServiceName + ", cost=" + cost + "]";
  }

}
