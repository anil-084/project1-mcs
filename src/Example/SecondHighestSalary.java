package Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    static void main() {
        List<Employee> employeeList = Arrays.asList(new Employee(101,"Anil",80000)
                ,new Employee(102,"Sai",30000)
                ,new Employee(103,"Ram",50000)
                ,new Employee(104,"Sasi",100000)
                );
        //Highest Salary
        Employee employee  = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(employee);
        //Second Highest Salary

        Employee employee2  = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(employee2);

        //Step-by-Step Explanation
        //employeeList.stream()
        //
        //Converts your employeeList (a List<Employee>) into a stream for functional-style processing.
        //
        //.sorted(Comparator.comparing(Employee::getSalary).reversed())
        //
        //Sorts the employees by their salary.
        //
        //Comparator.comparing(Employee::getSalary) → compares employees based on salary.
        //
        //.reversed() → sorts in descending order (highest salary first).
        //
        //👉 After this step, the stream is ordered from the richest employee to the least paid.
        //
        //.skip(1)
        //
        //Skips the first element in the sorted stream.
        //
        //Since the first element is the employee with the highest salary, skipping it means we now start from the second highest salary.
        //
        //.findFirst()
        //
        //Retrieves the first element from the remaining stream.
        //
        //That will be the employee with the second highest salary.
        //
        //.orElse(null)
        //
        //If the stream is empty (e.g., if the list had fewer than 2 employees), return null instead of throwing an exception.
    }
}
