package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleFemalCount {
    public static void main(String[] args) {
        List<Employee1> employeeList = Arrays.asList(
                new Employee1("Anil", "Hyderabad", "Male"),
                new Employee1("Sunil", "Rajol", "Male"),
                new Employee1("Kavay", "Machilipatnam", "Female"),
                new Employee1("Jaya", "Gangapuram", "Female"),
                new Employee1("Laxmi", "Kuravapuram", "Female")
        );


       /* Map<String, Long> genderCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        genderCount.forEach((gender, count) ->{
            System.out.println("gender " + gender + " :" + count);
        });*/
        Map<String, List<String>> genderToName = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getGender,
                        Collectors.mapping(Employee1::getName, Collectors.toList())
                ));

        genderToName.forEach((gender, names)->{
           if(names.size() > 1){
               System.out.println("Gender : " + gender + " Count : " + names.size());
               System.out.println("Names : " + String.join(",", names));
           }
       });

    }


}
