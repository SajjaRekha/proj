package neu.edu.model;

public class VehicleCategory {
    private  int categoryId;
    private String categoryType;
    private  String description;
    private Car car;

    public VehicleCategory(int categoryId, String categoryType, String description, Car car) {
        this.categoryId = categoryId;
        this.categoryType = categoryType;
        this.description = description;
        this.car = car;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "categoryId=" + categoryId +
                ", categoryType='" + categoryType + '\'' +
                ", description='" + description + '\'' +
                ", car=" + car +
                '}';
    }
}
