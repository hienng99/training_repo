package collections.sortedsetandcomparition.comparable;

public class Employee implements Comparable<Employee> {
    private String fullName;
    private float salary;

    public Employee(String name, float salary) {
        this.fullName = name;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        float temp = this.salary - o.salary;
        if (temp > 0) {
            return -1;
        } else if (temp < 0) {
            return 1;
        }
        return -this.fullName.compareTo(o.fullName);
    }
}
