package ComparableCompartorExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    static void main() {
        List<Student> employeeArrayList  = new ArrayList<>();
        employeeArrayList.add(new Student(101,"Sai",30000));
        employeeArrayList.add(new Student(102,"Anil",70000));
        employeeArrayList.add(new Student(103,"Raju",40000));
        employeeArrayList.add(new Student(106,"Sym",20000));
        employeeArrayList.add(new Student(107,"Ram",90000));
        employeeArrayList.add(new Student(104,"Raj",100000));

       // employeeArrayList.sort((s1,s2)->Integer.compare(s1.id,s2.id));

       // employeeArrayList.sort(Comparator.comparing(student -> student.name));

        employeeArrayList.sort(Comparator.comparing(Student::getSalary).reversed());

        System.out.println(employeeArrayList.toString());
    }
}
