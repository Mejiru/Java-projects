package list.pos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Organization {
    private List<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee em) {
        employees.add(em);
    }

    public Employee find(int empId) {
        for (Employee employee : employees) {
            if (employee.getEmpid() == empId) {
                return employee;
            }
        }
        return null; // Employee with the specified empId not found
    }

    public void addEmployeeAfter(Employee newEmployee, int index) {
        if (index >= 0 && index < employees.size()) {
            employees.add(index + 1, newEmployee);
        }
        else System.out.println("Invalid employee");
    }

    public void replaceEmployee(Employee oldEmployee, Employee newEmployee) {
        if (employees.contains(oldEmployee)) {
            int index = employees.indexOf(oldEmployee);
            employees.set(index, newEmployee);
        }
    }
    public void printOrganization() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}

