package camparableAndComparator;

import java.util.*;
import java.util.stream.Collectors;

/*Employee1 -
id : 100
name : Jack
state: AZ
Employee2 -
id : 100
name : Mark
state: CA

Employee3 -
id : 200
name : John
state: WA

Employee 4:
id: 300
name : Josh
state: NY*/
public class DuplicateEmployeeName {
    public static void main(String[] args) {

        List<EmployeeObj> listEmployees = Arrays.asList(
                new EmployeeObj(100, "Jack"),
                new EmployeeObj(100, "mark"),
                new EmployeeObj(101, "Anil"),
                new EmployeeObj(102, "Kumar")
        );

       /* Map<Integer, List<String>> duplicates = listEmployees.stream()
                .collect(Collectors.groupingBy(EmployeeObj::getId, Collectors.mapping(EmployeeObj::getName, Collectors.toList())));
*/
        Set<EmployeeObj> printSingleValue = new HashSet<>(listEmployees);
        System.out.println("printSingleValue ===>" + printSingleValue);
        /*duplicates.entrySet().stream()
                .filter(e-> e.getValue().size() >1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        duplicates.forEach((id, name)->{
            System.out.println("Duplicate Id   :" + id + " Name " + name);
        });*/

    }
}
