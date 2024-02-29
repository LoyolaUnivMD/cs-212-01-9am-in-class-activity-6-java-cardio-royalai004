import java.util.Scanner;

// Define Gradebook class
class Gradebook {
    // Declare instance variables
    String name;
    String class_name;
    int[] grades;
    Scanner scan; // Scanner object for user input

    // Calculates the average of grades
    int average(int[] grades) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            count++;
        }
        int avg = sum / count;
        return avg;
    }

    // Gets the student's name
    String get_name() {
        System.out.println("What is your name?");
        name = scan.next();
        return name;
    }

    // Gets the class name
    String get_class() {
        System.out.println("What is the class?");
        class_name = scan.next();
        return class_name;
    }

    // Gets grades from the user
    int[] get_grades() {
        grades = new int[5]; // Initialize the array to store grades
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter your number grade value. ");
            int grade = scan.nextInt();
            // Validate input to be between 0 and 100
            while (!(grade >= 0 && grade <= 100)) {
                System.out.println("Please enter your number grade value between 0 and 100: ");
                grade = scan.nextInt();
            }
            grades[i] = grade; // Assign the grade to the array
        }
        return grades;
    }

    // Converts average to letter grade
    String get_letter(int avg) {
        String letter;
        if (avg >= 90) {
            letter = "A";
        } else if (avg >= 80) {
            letter = "B";
        } else if (avg >= 70) {
            letter = "C";
        } else if (avg >= 60) {
            letter = "D";
        } else {
            letter = "F";
        }
        return letter;
    }

    // Output student's grade information
    void output_grade(int avg, String letter) {
        System.out.println("Student name: " + name);
        System.out.println("Class: " + class_name);
        System.out.println("GPA: " + avg);
        System.out.println("Letter Grade: " + letter);
    }
}

// Main class
public class Activity1 {
    // Main method
    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook(); // Create Gradebook object
        Scanner scanner = new Scanner(System.in); // Initialize Scanner object
        gradebook.scan = scanner; // Assign scanner to the Gradebook object

        // Obtain student information and grades
        String name = gradebook.get_name();
        String class_name = gradebook.get_class();
        int[] grades = gradebook.get_grades();

        // Calculate average and letter grade
        int avg = gradebook.average(grades);
        String letter = gradebook.get_letter(avg);

        // Output student's grade information
        gradebook.output_grade(avg, letter);

        scanner.close(); // Close the scanner after its use
    }
}
