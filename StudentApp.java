import java.util.Scanner;

// Class named StudentRecord
public class StudentRecord {
    // Fields to store student details
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Class named StudentApp
public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their student ID, name, and course
        System.out.print("Enter your student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object using the user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Call the displayInfo method to display the student's details
        student.displayInfo();

        // Close the scanner
        scanner.close();
    }
}