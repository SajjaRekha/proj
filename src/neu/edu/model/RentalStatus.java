package neu.edu.model;

public class RentalStatus {
    private int rentalStatusId;
    private String rentalStatusName;

    public RentalStatus(int rentalStatusId, String rentalStatusName) {
        this.rentalStatusId = rentalStatusId;
        this.rentalStatusName = rentalStatusName;
    }

    public int getRentalStatusId() {
        return rentalStatusId;
    }

    public void setRentalStatusId(int rentalStatusId) {
        this.rentalStatusId = rentalStatusId;
    }

    public String getRentalStatusName() {
        return rentalStatusName;
    }

    public void setRentalStatusName(String rentalStatusName) {
        this.rentalStatusName = rentalStatusName;
    }

    @Override
    public String toString() {
        return "RentalStatus{" +
                "rentalStatusId=" + rentalStatusId +
                ", rentalStatusName='" + rentalStatusName + '\'' +
                '}';
    }
}
