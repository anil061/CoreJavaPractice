package Java8;

import java.util.Objects;

public class DuplicateEmployee {
    private int id;
    private String name;

    // Constructor
    public DuplicateEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DuplicateEmployee)) return false;
        DuplicateEmployee de = (DuplicateEmployee) o;
        return id == de.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DuplicateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
