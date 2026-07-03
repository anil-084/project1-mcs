package ComparableCompartorExample;

public class Employee implements Comparable<Employee>{
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee employee) {
        return Double.compare(this.salary,employee.salary);
    }
}
