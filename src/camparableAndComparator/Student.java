package camparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student s) {
        if(id == s.id){
          return 0;
        }else if(id > s.id){
            return 1;
        } else {
            return -1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(101, "Ganapathi");
        Student s2 = new Student(102, "Datta");
        Student s3 = new Student(103, "Sripadha");
        Student s4 = new Student(104, "Nrisimhaswamy");
        Student s5 = new Student(101, "MalleshBaba");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        Collections.sort(studentList, new NameComparator());

        System.out.println(studentList);

    }


}
