package collections;



/*average of all
<40 failed
list down top 3 */
/*
anil, 70
jay, 80
sunil,90
*/

/*read the file
* prepare one object to get marks and name
* */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FirstDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        String fileName = "/Users/anil/2025Projects/CoreJavaPractice-main/src/collections/student.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
             String line;
          while((line= bufferedReader.readLine())!=null){
              String[] split = line.split("\\s+");
              if (split.length!=2) continue;
               String name = split[0];
               int mark = Integer.parseInt(split[1]);
              studentList.add(new Student(name, mark));
          }

        } catch (IOException e){
            e.printStackTrace();
        }

        OptionalDouble average = studentList.stream()
                .mapToInt(s -> s.getMarks())
                .average();
        System.out.println("averae  ===>" + average);

        List<Student> topThree = studentList.stream()
                .sorted((x, y) -> y.getMarks() - x.getMarks())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("topThree  => " + topThree);

    }
}
