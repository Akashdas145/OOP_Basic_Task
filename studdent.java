import java.util.ArrayList;

class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    // Constructor
    public  Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add multiple courses at once
    public void addCourses(String... courseList) {
        for (String c : courseList) {
            courses.add(c);
        }
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Display student courses
    public void displayCourses() {
        System.out.println(name + "'s courses: " + courses);
    }
}
public class studdent{
    public static void main(String[] args) {
        System.out.println("Student Details:");

        // Creating students
        Student s1 = new Student("Arjun Mehta", 12);
        Student s2 = new Student("Sophia Brown", 11);
        Student s3 = new Student("Liam Carter", 10);

        // Display details
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        // Add courses
        System.out.println("\nAdding courses for Arjun Mehta");
        s1.addCourses("Math", "Physics", "English");
        s1.displayCourses();

        System.out.println("\nAdding courses for Sophia Brown");
        s2.addCourses("Biology", "Chemistry", "History");
        s2.displayCourses();

        // Remove a course
        System.out.println("\nRemoving 'Physics' course for Arjun Mehta");
        s1.removeCourse("Physics");
        s1.displayCourses();
    }
}
