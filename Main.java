package Task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = createEmployee("Alex", "Fox", -333);
        Employee employee2 = createEmployee("Аня", "Vil", 345);
        Employee employee3 = createEmployee("Dim", "Tim", 566);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        employeeList.removeAll(Collections.singleton(null));

        System.out.println("EMPLOYEE LIST: \n" + employeeList);
    }

    public static Employee createEmployee(String name, String surname, double salary) {
        Employee employee = null;
        try {
            employee = new Employee(name, surname, salary);
        } catch (ImpossibleNameException ex) {
            System.out.println(ex.getMessage() + " " + ex.getName() + " " + ex.getSurname());
        } catch (TooSmallSalaryException ex) {
            System.out.println(ex.getMessage() + " " + ex.getSalary());
        }
        return employee;
    }
}
