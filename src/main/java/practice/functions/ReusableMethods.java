package practice.functions;

import practice.objects.Student;

import java.util.ArrayList;

public class ReusableMethods {
    public void addStudent(ArrayList<Student> students, Student student){
        students.add(student);
    }
    public void removeStudent(ArrayList<Student> students, Student student){
        students.remove(student);
    }
    public void printStudents(ArrayList<Student> students){
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }
}
