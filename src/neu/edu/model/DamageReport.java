package neu.edu.model;

import java.util.Date;

public class DamageReport {

    private int damageReportId;
    private Rental rental;
    private Date reportGeneratedDate;
    private String reportDescription;

    public DamageReport(int damageReportId, Rental rental, Date reportGeneratedDate, String reportDescription) {
        this.damageReportId = damageReportId;
        this.rental = rental;
        this.reportGeneratedDate = reportGeneratedDate;
        this.reportDescription = reportDescription;
    }

    public int getDamageReportId() {
        return damageReportId;
    }

    public void setDamageReportId(int damageReportId) {
        this.damageReportId = damageReportId;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Date getReportGeneratedDate() {
        return reportGeneratedDate;
    }

    public void setReportGeneratedDate(Date reportGeneratedDate) {
        this.reportGeneratedDate = reportGeneratedDate;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    @Override
    public String toString() {
        return "DamageReport{" +
                "damageReportId=" + damageReportId +
                ", rental=" + rental +
                ", reportGeneratedDate=" + reportGeneratedDate +
                ", reportDescription='" + reportDescription + '\'' +
                '}';
    }
}
