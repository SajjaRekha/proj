package neu.edu.model;

import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private int customerPhoneNumber;
    private List<Rental> customerRentals;

    public Customer(int customerId, String customerName, int customerPhoneNumber, List<Rental> customerRentals) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerRentals = customerRentals;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public List<Rental> getCustomerRentals() {
        return customerRentals;
    }

    public void setCustomerRentals(List<Rental> customerRentals) {
        this.customerRentals = customerRentals;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPhoneNumber=" + customerPhoneNumber +
                ", customerRentals=" + customerRentals +
                '}';
    }
}
