package ListOfEmployees;

import java.util.Comparator;

public class EmpComparatorByName implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
