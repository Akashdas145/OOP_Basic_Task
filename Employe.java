class Employee {
    String name;
    String jobTitle;
    double salary;

    // Constructor to initialize employee details
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
    // Method to calculate and update salary with a given percentage increase
    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}
public class Employe{

    public static void main(String[] args) {
        // Create employee objects with new values
        Employee employee1 = new Employee("Joni ", "Software Developer", 50000.0);
        Employee employee2 = new Employee("sourav", "Data Scientist", 75000.0);
        // Display employee details before salary raise
        System.out.println("Employee Details:");
        employee1.displayDetails();
        employee2.displayDetails();
        // Raise salary by certain percentages
        employee1.raiseSalary(10); // Raise by 10%
        employee2.raiseSalary(15); // Raise by 15%
        // Display employee details after salary raise
        System.out.println("\nAfter raising salary:");
        System.out.println("10% for 'Joni':");
        employee1.displayDetails();

        System.out.println("15% for 'sourav':");
        employee2.displayDetails();
    }
}
