package neu.edu.model;

public class Service {

    private int serviceId;
    private String serviceName;
    private double serviceCost;
    private String serviceDescription;
    private Rental rental;

    public Service(int serviceId, String serviceName, double serviceCost, String serviceDescription, Rental rental) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
        this.serviceDescription = serviceDescription;
        this.rental = rental;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceCost=" + serviceCost +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", rental=" + rental +
                '}';
    }
}
