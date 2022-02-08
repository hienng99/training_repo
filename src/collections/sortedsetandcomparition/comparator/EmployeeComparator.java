package collections.sortedsetandcomparition.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        float temp = o1.getSalary() - o2.getSalary();
        if (temp > 0) {
            return 1;
        } else if (temp < 0) {
            return -1;
        }
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
