package ComparableCompartorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    static void main() {

        List<Employee> employeeArrayList  = new ArrayList<>();
        employeeArrayList.add(new Employee(101,"Sai",30000));
        employeeArrayList.add(new Employee(102,"Anil",70000));
        employeeArrayList.add(new Employee(103,"Raju",40000));
        employeeArrayList.add(new Employee(106,"Sym",20000));
        employeeArrayList.add(new Employee(107,"Ram",90000));
        employeeArrayList.add(new Employee(104,"Raj",100000));

        Collections.sort(employeeArrayList);

        System.out.println(employeeArrayList.toString());
    }
}
