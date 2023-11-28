package neu.edu.model;

import java.util.Date;

public class MaintenanceSchedule {

    private int scheduleId;
    private Car car;
    private Date maintenanceDate;
    private String description;

    public MaintenanceSchedule(int scheduleId, Car car, Date maintenanceDate, String description) {
        this.scheduleId = scheduleId;
        this.car = car;
        this.maintenanceDate = maintenanceDate;
        this.description = description;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaintenanceSchedule{" +
                "scheduleId=" + scheduleId +
                ", car=" + car +
                ", maintenanceDate=" + maintenanceDate +
                ", description='" + description + '\'' +
                '}';
    }
}
