package sg.edu.rp.c346.employeeinfo;

public class EmployeeInfo {
    private String name;
    private String role;
    private Double salary;

    public EmployeeInfo(String name, String role, Double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
