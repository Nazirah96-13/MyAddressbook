package sg.edu.rp.c346.id17032457.myaddressbook;

public class Item {
    private String name;
    private Integer mobileNumber;
    private String email;
    private Integer preferredMode;

    public Item(String name, Integer mobileNumber, String email, Integer preferredMode) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.preferredMode = preferredMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPreferredMode() {
        return preferredMode;
    }

    public void setPreferredMode(Integer preferredMode) {
        this.preferredMode = preferredMode;
    }
}
