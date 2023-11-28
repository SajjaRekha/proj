package neu.edu.model;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private Customer customer;
    private Car car;
    private Date reservationStartDate;
    private Date reservationEndDate;
    private String reservationStatus;

    public Reservation(int reservationId, Customer customer, Car car, Date reservationStartDate, Date reservationEndDate, String reservationStatus) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.car = car;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        this.reservationStatus = reservationStatus;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getReservationStartDate() {
        return reservationStartDate;
    }

    public void setReservationStartDate(Date reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public Date getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationEndDate(Date reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", customer=" + customer +
                ", car=" + car +
                ", reservationStartDate=" + reservationStartDate +
                ", reservationEndDate=" + reservationEndDate +
                ", reservationStatus='" + reservationStatus + '\'' +
                '}';
    }
}
