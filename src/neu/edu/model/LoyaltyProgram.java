package neu.edu.model;

public class LoyaltyProgram {

    private int loyaltyProgramId;
    private String programName;
    private String programDescription;
    private Customer customer;

    public LoyaltyProgram(int loyaltyProgramId, String programName, String programDescription, Customer customer) {
        this.loyaltyProgramId = loyaltyProgramId;
        this.programName = programName;
        this.programDescription = programDescription;
        this.customer = customer;
    }

    public int getLoyaltyProgramId() {
        return loyaltyProgramId;
    }

    public void setLoyaltyProgramId(int loyaltyProgramId) {
        this.loyaltyProgramId = loyaltyProgramId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "LoyaltyProgram{" +
                "loyaltyProgramId=" + loyaltyProgramId +
                ", programName='" + programName + '\'' +
                ", programDescription='" + programDescription + '\'' +
                ", customer=" + customer +
                '}';
    }
}
