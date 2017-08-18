package lesson9.models;

public class Report {
    private String localDate;
    private String country;
    private String location;
    private String eventType;
    private String extraInfo;

    public Report(String localDate, String country, String location, String eventType, String extraInfo) {
        this.localDate = localDate;
        this.country = country;
        this.location = location;
        this.eventType = eventType;
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        return "\nReport:\n" +
                "localDate='" + localDate + '\'' +
                ", \tcountry='" + country + '\'' +
                ", \tlocation='" + location + '\'' +
                ", \teventType='" + eventType + '\'' +
                ", \textraInfo='" + extraInfo + '\''
                ;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
