package neu.edu.model;

import java.util.List;

public class RentalAgency {

    private int agencyId;
    private String agencyName;
    private String location;
    private List<Car> availableCars;

    public RentalAgency(int agencyId, String agencyName, String location, List<Car> availableCars) {
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.location = location;
        this.availableCars = availableCars;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(List<Car> availableCars) {
        this.availableCars = availableCars;
    }

    @Override
    public String toString() {
        return "RentalAgency{" +
                "agencyId=" + agencyId +
                ", agencyName='" + agencyName + '\'' +
                ", location='" + location + '\'' +
                ", availableCars=" + availableCars +
                '}';
    }
}
