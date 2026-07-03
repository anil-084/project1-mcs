package Example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHigestAndLowestSalaryUsingTeeing {

    static void main() {
        List<Employee> employeeList = List.of(new Employee(101, "Anil", 80000)
                , new Employee(102, "Sai", 30000)
                , new Employee(103, "Ram", 50000)
                , new Employee(104, "Sasi", 100000)
        );

        Map<String, Employee> result = employeeList.stream().collect(Collectors.teeing(
                Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)),
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                (min, max) -> Map.of("Lowest", min.get(), "Highest", max.get())
        ));
        System.out.println("Highest Salary Employee" + result.get("Highest"));
        System.out.println("Lowest Salary Employee" + result.get("Lowest"));
    }
}
