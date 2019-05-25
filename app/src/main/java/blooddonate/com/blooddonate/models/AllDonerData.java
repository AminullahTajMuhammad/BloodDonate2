package blooddonate.com.blooddonate.models;

public class AllDonerData {
    String name;
    String cityName;
    String bloodGroup;
    String mobileNumber;

    public AllDonerData(String name, String cityName, String bloodGroup) {

        this.name = name;
        this.cityName = cityName;
        this.bloodGroup = bloodGroup;
    }

    public AllDonerData(String name, String cityName, String bloodGroup, String mobileNumber) {
        this.name = name;
        this.cityName = cityName;
        this.bloodGroup = bloodGroup;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
