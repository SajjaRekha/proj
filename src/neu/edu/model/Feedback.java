package neu.edu.model;

import java.util.Date;

public class Feedback {
    private int feedbackId;
    private Customer customer;
    private String feedbackDescription;
    private int userProvidedRating;
    private Date feedbackDate;

    public Feedback(int feedbackId, Customer customer, String feedbackDescription, int userProvidedRating, Date feedbackDate) {
        this.feedbackId = feedbackId;
        this.customer = customer;
        this.feedbackDescription = feedbackDescription;
        this.userProvidedRating = userProvidedRating;
        this.feedbackDate = feedbackDate;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public int getUserProvidedRating() {
        return userProvidedRating;
    }

    public void setUserProvidedRating(int userProvidedRating) {
        this.userProvidedRating = userProvidedRating;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", customer=" + customer +
                ", feedbackDescription='" + feedbackDescription + '\'' +
                ", userProvidedRating=" + userProvidedRating +
                ", feedbackDate=" + feedbackDate +
                '}';
    }
}
