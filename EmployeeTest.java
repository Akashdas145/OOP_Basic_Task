import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int getYearsOfService() {
        LocalDate today = LocalDate.now();
        return Period.between(hireDate, today).getYears();
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
        System.out.println();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice Johnson", 60000, LocalDate.of(2020, 5, 10));
        Employee e2 = new Employee("David Smith", 80000, LocalDate.of(2018, 3, 25));
        Employee e3 = new Employee("Emma Watson", 55000, LocalDate.of(2012, 11, 5));

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}