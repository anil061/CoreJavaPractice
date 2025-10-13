package ListOfEmployees;

import java.util.Objects;

public class Employees {
    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees employees)) return false;
        return getId() == employees.getId() && Double.compare(getSalary(), employees.getSalary()) == 0 && Objects.equals(getName(), employees.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary());
    }
}
