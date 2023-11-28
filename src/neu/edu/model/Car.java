package neu.edu.model;

public class Car {

    private int carId;
    private String make;
    private String model;
    private int year;

    public Car(int carId, String make, String model, int year) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
