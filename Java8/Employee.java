package com.codes.Java8;

public class Employee {

    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department,int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        salary = salary;
    }
}
