package neu.edu.model;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String position;
    private Date joiningDate;

    public Employee(int employeeId, String employeeName, String position, Date joiningDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.joiningDate = joiningDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", position='" + position + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
