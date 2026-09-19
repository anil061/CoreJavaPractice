package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {
        List<EmployeeObj> employeeObjList = Arrays.asList(new EmployeeObj(1, "HR", "Anil")
        , new EmployeeObj(2, "PT", "Akhil"), new EmployeeObj(3, "Science", "Sunil"),
                new EmployeeObj(4, "PT", "Nikhil"),new EmployeeObj(5, "HR", "Vamshi"),
                new EmployeeObj(6, "HR", "Venkat"));

        Map<String, Long> deptCount = employeeObjList.stream()
                .collect(Collectors.groupingBy(EmployeeObj::getDept, Collectors.counting()));

        deptCount
                .forEach((d,c)->{
                    System.out.println("dept " + d + " count " + c);
                });
    }

}
