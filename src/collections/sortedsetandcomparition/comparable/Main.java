package collections.sortedsetandcomparition.comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Annie", 5000);
        Employee e2 = new Employee("Dane", 1000);
        Employee e3 = new Employee("Emily", 1000);
        Employee e4 = new Employee("Bryan", 5000);
        Employee e5 = new Employee("Cherry", 1000);

        Set<Employee> employees = new TreeSet<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        for(Employee e: employees)  {
            System.out.println(e.getSalary() + " / " + e.getFullName());
        }
    }
}
