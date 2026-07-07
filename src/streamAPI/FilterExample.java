package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FilterExample {
    static void main() {
        List<String> names = Arrays.asList("John", "Sara", "Mark", "Jennifer", "Paul", "Jane");

        List result= names.stream().filter(n-> n.startsWith("J")).toList();
        System.out.println(result);


        List<Employee> employeeList = List.of(new Employee(101,"anil",1800000,"anil@gnmail.com","IT"),
                new Employee(102,"sai",1200000,"sai@gmail.com","HR"),
                new Employee(103,"syam",1000000,"syam@gmail.com","Non-IT"),
                new Employee(104,"raj",1400000,"raj@gnmail.com","Finance"),
                new Employee(105,"roja",1900000,"roja@gmail.com","HR"),
                new Employee(106,"siva",2000000,"siva@gmail.com","IT"),
                new Employee(107,"siri",1400000,"siri@gmail.com","Non-IT"),
                new Employee(108,"appa",1800000,"appa@gnmail.com","Finance")
                );

        Map<String, Optional<Employee>> optionalMap = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        optionalMap.forEach((dept,emp)->{
            System.out.println(dept+"::"+emp.get());
        });
    }


}
