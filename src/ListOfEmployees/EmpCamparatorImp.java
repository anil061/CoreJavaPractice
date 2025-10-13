package ListOfEmployees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpCamparatorImp {
    public static void main(String[] args) {

        List<Employees>  empList = new ArrayList<>();
        empList.add(new Employees(1,"Anil", 75000));
        empList.add(new Employees(2,"Sunil", 85000));
        empList.add(new Employees(3,"Ramesh", 95000));
        empList.add(new Employees(4,"Venky", 15000));
        empList.add(new Employees(5,"Sachin", 105000));

       // empList.forEach(System.out::println);

        Collections.sort(empList,new UsingComparator());

        System.out.println("After sort by the salary ");
        empList.forEach(System.out::println);

        Collections.sort(empList,new EmpComparatorByName());

        System.out.println("After sort by the Name==== ");
        empList.forEach(System.out::println);
    }
}
