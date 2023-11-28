package neu.edu.model;

import java.util.Date;

public class Rental {
    private int rentalId;
    private Customer customer;
    private Car car;
    private Date rentalStartDate;
    private Date rentalReturnDate;
    private String rentalStatus;
    private double totalRentCost;

    public Rental(int rentalId, Customer customer, Car car, Date rentalStartDate, Date rentalReturnDate, String rentalStatus, double totalRentCost) {
        this.rentalId = rentalId;
        this.customer = customer;
        this.car = car;
        this.rentalStartDate = rentalStartDate;
        this.rentalReturnDate = rentalReturnDate;
        this.rentalStatus = rentalStatus;
        this.totalRentCost = totalRentCost;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
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

    public Date getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(Date rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public Date getRentalReturnDate() {
        return rentalReturnDate;
    }

    public void setRentalReturnDate(Date rentalReturnDate) {
        this.rentalReturnDate = rentalReturnDate;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public double getTotalRentCost() {
        return totalRentCost;
    }

    public void setTotalRentCost(double totalRentCost) {
        this.totalRentCost = totalRentCost;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId +
                ", customer=" + customer +
                ", car=" + car +
                ", rentalStartDate=" + rentalStartDate +
                ", rentalReturnDate=" + rentalReturnDate +
                ", rentalStatus='" + rentalStatus + '\'' +
                ", totalRentCost=" + totalRentCost +
                '}';
    }
}
