package lab13;

import java.util.ArrayList;

public class Manager extends Employee {

    private ArrayList<Employee> employees;

    public Manager(String name, String jobTitle) {
        super(name, jobTitle);
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder(super.getInfo());
        for (Employee emp : employees) {
            info.append(emp.getInfo());
        }
        return info.toString();
    }
}