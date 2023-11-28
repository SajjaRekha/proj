package neu.edu.model;

import java.util.Date;

public class Transaction {

    private int transactionId;
    private Rental rental;
    private Date transactionDate;
    private String transactionDescription;

    public Transaction(int transactionId, Rental rental, Date transactionDate, String transactionDescription) {
        this.transactionId = transactionId;
        this.rental = rental;
        this.transactionDate = transactionDate;
        this.transactionDescription = transactionDescription;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", rental=" + rental +
                ", transactionDate=" + transactionDate +
                ", transactionDescription='" + transactionDescription + '\'' +
                '}';
    }
}
