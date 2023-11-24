package practice.runner;

import practice.functions.ReusableMethods;
import practice.objects.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ReusableMethods methods = new ReusableMethods();
    public static ArrayList<Student> students = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (isWorking()) {


        }
    }
private static boolean isWorking(){
        boolean isAsking = true;
    System.out.println("""
                    Please select an option:
                    1\tadd student
                    2\tremove student
                    3\tprint student
                    4\tquit
                    """);
    String selection = scanner.nextLine();
    switch (selection) {
        case "1" -> addingStudent();
        case "2" -> removingStudent();
        case "3" -> printingStudents();
        case "4" -> isAsking = false;
    }
    return isAsking;
}
    private static void removingStudent() {
        System.out.println("Enter name to remove");
        Student theStudent;
        String nameToRemove= scanner.nextLine();
        for (Student student:
             students) {
            if (student.getName().equalsIgnoreCase(nameToRemove)){
                theStudent = student;
                methods.removeStudent(students,theStudent);
                break;
            }
        }
    }

    private static void printingStudents() {
        methods.printStudents(students);
    }

    public static void addingStudent() {
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Age");
        int age = scanner.nextInt();
        Student student = new Student(name, age);
        scanner.nextLine();
        methods.addStudent(students, student);
    }


}
