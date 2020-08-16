public class Sender {

  private String accountId;
  private String name;
  private String address;
  private String city;
  private String state;
  private String zipCode;
  private String phoneNumber;

  public Sender() {
  }

  public Sender(String accountId, String name, String address, String city, String state, String zipCode,
      String phoneNumber) {
    super();
    this.accountId = accountId;
    this.name = name;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.phoneNumber = phoneNumber;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Sender [accountId=" + accountId + ", name=" + name + ", address=" + address + ", city=" + city + ", state="
        + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
  }

}
