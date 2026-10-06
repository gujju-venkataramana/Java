import java.util.Scanner;

class Student {
    private int rollNumber;
    private String studentName;
    private int[] marks;

    // Constructor
    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    // Find highest mark
    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Find lowest mark
    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Calculate percentage
    double calculatePercentage() {
        double percentage = (calculateTotal() / 500.0) * 100;

        return Math.round(percentage * 100.0) / 100.0;
    }

    // Calculate grade
    String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Check pass or fail
    String getResult() {
        if (calculatePercentage() >= 50)
            return "Pass";
        else
            return "Fail";
    }

    // Performance remark
    String getRemark() {
        String grade = calculateGrade();

        if (grade.equals("A+"))
            return "Excellent Performance";
        else if (grade.equals("A"))
            return "Very Good Performance";
        else if (grade.equals("B"))
            return "Good Performance";
        else if (grade.equals("C"))
            return "Satisfactory Performance";
        else if (grade.equals("D"))
            return "Needs Improvement";
        else
            return "Poor Performance";
    }

    // Display student details
    void displayStudentDetails() {
        String formattedName = studentName.trim().toUpperCase();

        System.out.println("\n===== PERFORMANCE REPORT =====");
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());
        System.out.println("Total Marks       : " + calculateTotal());
        System.out.println("Average Marks     : " + calculateAverage());
        System.out.println("Highest Mark      : " + findHighest());
        System.out.println("Lowest Mark       : " + findLowest());
        System.out.printf("Percentage        : %.2f%%%n", calculatePercentage());
        System.out.println("Grade             : " + calculateGrade());
        System.out.println("Result            : " + getResult());
        System.out.println("Performance Remark: " + getRemark());
    }
}

public class StudentPerformanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT PERFORMANCE ANALYSIS =====");

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("\nEnter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(rollNumber, studentName, marks);

        student.displayStudentDetails();

        sc.close();
    }
}
