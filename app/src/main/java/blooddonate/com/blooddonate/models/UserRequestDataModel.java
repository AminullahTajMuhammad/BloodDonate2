package blooddonate.com.blooddonate.models;

public class UserRequestDataModel {
    private String bloodRequestFor;
    private String city;
    private String requestBloodGroup;

    public UserRequestDataModel(String bloodRequestFor, String city, String requestBloodGroup) {
        this.bloodRequestFor = bloodRequestFor;
        this.city = city;
        this.requestBloodGroup = requestBloodGroup;
    }

    public String getBloodRequestFor() {
        return bloodRequestFor;
    }

    public void setBloodRequestFor(String bloodRequestFor) {
        this.bloodRequestFor = bloodRequestFor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRequestBloodGroup() {
        return requestBloodGroup;
    }

    public void setRequestBloodGroup(String requestBloodGroup) {
        this.requestBloodGroup = requestBloodGroup;
    }
}
