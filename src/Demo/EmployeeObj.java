package Demo;

import java.util.Objects;

public class EmployeeObj {
    private int id;
    private String dept;
    private String name;

    public EmployeeObj() {
    }

    public EmployeeObj(int id, String dept, String name) {
        this.id = id;
        this.dept = dept;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeObj that)) return false;
        return getId() == that.getId() && Objects.equals(getDept(), that.getDept()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDept(), getName());
    }

    @Override
    public String toString() {
        return "EmployeeObj{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
