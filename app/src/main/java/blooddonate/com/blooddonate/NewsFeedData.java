package blooddonate.com.blooddonate;

public class NewsFeedData {
    String name;
    int profilePic;
    String updateTime;
    String cityName;
    String desc;

    public NewsFeedData(String name, int profilePic, String updateTime, String cityName, String desc) {
        this.name = name;
        this.profilePic = profilePic;
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
