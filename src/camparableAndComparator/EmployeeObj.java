package camparableAndComparator;

import lombok.Getter;

@Getter
public class EmployeeObj {
    private int id;
    private String  name;

    public EmployeeObj() {
    }

    public EmployeeObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
