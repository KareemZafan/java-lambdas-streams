package employees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void testEmployeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");

        String actual = employeeUtils.getFullName(employee);

        assertThat(actual).isEqualTo("Jerome Donaldson");
    }

    @Test
    void testEmployeeManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Westbay");
        employee1.setEmployeeManager(employee2);

        String actual = employeeUtils.getManagersLastName(employee1);

        assertThat(actual).isEqualTo("Westbay");
    }

    @Test
    void testtEmployeeInEmploymentLongerThanFiveYears() {
        Employee employee = new Employee();
        employee.setYearOfService(20);

        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

        assertThat(actual).isTrue();
    }

    @Test
    void testEmployeeHasMoreThanThreeDirectReports() {
        Employee employee = new Employee();
        employee.setNumberOfDirectReports(5);

        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);

        assertThat(actual).isTrue();
    }

    @Test
    void testEmployeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearOfService(5);
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertThat(actual).isTrue();
    }

}
