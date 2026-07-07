package stringpack;

public class HashCodeAndEquals {
    static void main() {
        Employee employee  =new Employee(101,"anil",12);
        Employee employee1  =new Employee(102,"raj",22);
        System.out.println(employee.equals(employee1));

    }
}
