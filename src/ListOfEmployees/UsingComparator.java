package ListOfEmployees;

import java.util.Comparator;

public class UsingComparator implements Comparator<Employees> {


    @Override
    public int compare(Employees o1, Employees o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}
