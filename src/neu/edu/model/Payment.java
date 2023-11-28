package neu.edu.model;

import java.util.Date;

public class Payment {

    private int paymentId;
    private Date paymentDate;
    private double totalAmountPaid;
    private Rental rental;

    public Payment(int paymentId, Date paymentDate, double totalAmountPaid, Rental rental) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.totalAmountPaid = totalAmountPaid;
        this.rental = rental;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(double totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate=" + paymentDate +
                ", totalAmountPaid=" + totalAmountPaid +
                ", rental=" + rental +
                '}';
    }
}
