package neu.edu.model;

import java.util.Date;

public class Insurance {

    private int insuranceId;
    private String insuranceType;
    private Date coverageStartDate;
    private Date coverageEndDate;
    private Rental rental;

    public Insurance(int insuranceId, String insuranceType, Date coverageStartDate, Date coverageEndDate, Rental rental) {
        this.insuranceId = insuranceId;
        this.insuranceType = insuranceType;
        this.coverageStartDate = coverageStartDate;
        this.coverageEndDate = coverageEndDate;
        this.rental = rental;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Date getCoverageStartDate() {
        return coverageStartDate;
    }

    public void setCoverageStartDate(Date coverageStartDate) {
        this.coverageStartDate = coverageStartDate;
    }

    public Date getCoverageEndDate() {
        return coverageEndDate;
    }

    public void setCoverageEndDate(Date coverageEndDate) {
        this.coverageEndDate = coverageEndDate;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceId=" + insuranceId +
                ", insuranceType='" + insuranceType + '\'' +
                ", coverageStartDate=" + coverageStartDate +
                ", coverageEndDate=" + coverageEndDate +
                ", rental=" + rental +
                '}';
    }
}
