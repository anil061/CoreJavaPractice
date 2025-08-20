package SortingDemos;

import java.util.Objects;

public class EmployeForSort {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String gender;

    public EmployeForSort() {
    }

    public EmployeForSort(int id, String name, String department, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeForSort employeForSort)) return false;
        return getId() == employeForSort.getId() && Double.compare(getSalary(), employeForSort.getSalary()) == 0 && Objects.equals(getName(), employeForSort.getName()) && Objects.equals(getDepartment(), employeForSort.getDepartment()) && Objects.equals(getGender(), employeForSort.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDepartment(), getSalary(), getGender());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emplpoyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
