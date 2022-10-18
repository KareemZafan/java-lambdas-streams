package employees;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearOfService;
    private Employee EmployeeManager;
    private int numberOfDirectReports;

    public Employee() {
        // TODO document why this constructor is empty
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public Employee getEmployeeManager() {
        return EmployeeManager;
    }

    public void setEmployeeManager(Employee employeeManager) {
        EmployeeManager = employeeManager;
    }

    public int getNumberOfDirectReports() {
        return numberOfDirectReports;
    }

    public void setNumberOfDirectReports(int numberOfDirectReports) {
        this.numberOfDirectReports = numberOfDirectReports;
    }
}
