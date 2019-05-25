package blooddonate.com.blooddonate.models;

public class NewsFeedData {
    String name;
    int profilePic;
    String updateTime;
    String cityName;
    public String desc;

    public NewsFeedData(String name, String updateTime, String cityName, String desc) {
        this.name = name;
        this.updateTime = updateTime;
        this.cityName = cityName;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
