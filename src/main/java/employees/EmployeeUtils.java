package employees;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = (Employee e) -> e.getFirstName() + " " + e.getLastName();
        return fullName.apply(employee);
    }

    public String getManagerLastName(Employee employee) {
        Function<Employee, String> managerLastName = e -> e.getEmployeeManager().getLastName();
        return managerLastName.apply(employee);
    }

    public String getManagersLastName(Employee employee) {
        Function<Employee, String> managersLastName = e -> e.getEmployeeManager().getLastName();
        return managersLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
        Predicate<Employee> employedLongerThanFiveYears = e -> (e.getYearOfService() > 5);
        return employedLongerThanFiveYears.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeDirectReports = e -> (e.getNumberOfDirectReports() > 3);
        return moreThanThreeDirectReports.test(employee);
    }

    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = e -> (e.getYearOfService() > 3 && (e.getNumberOfDirectReports() < 2));

        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }
}
