package neu.edu.model;

import java.util.Date;

public class Invoice {

    private int invoiceId;
    private Rental rental;
    private Date invoiceIssueDate;
    private Date invoiceDueDate;
    private double amountTobePaid;

    public Invoice(int invoiceId, Rental rental, Date invoiceIssueDate, Date invoiceDueDate, double amountTobePaid) {
        this.invoiceId = invoiceId;
        this.rental = rental;
        this.invoiceIssueDate = invoiceIssueDate;
        this.invoiceDueDate = invoiceDueDate;
        this.amountTobePaid = amountTobePaid;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Date getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    public void setInvoiceIssueDate(Date invoiceIssueDate) {
        this.invoiceIssueDate = invoiceIssueDate;
    }

    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public double getAmountTobePaid() {
        return amountTobePaid;
    }

    public void setAmountTobePaid(double amountTobePaid) {
        this.amountTobePaid = amountTobePaid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", rental=" + rental +
                ", invoiceIssueDate=" + invoiceIssueDate +
                ", invoiceDueDate=" + invoiceDueDate +
                ", amountTobePaid=" + amountTobePaid +
                '}';
    }
}
