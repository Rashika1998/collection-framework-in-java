import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeedOfCollection {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 2;

        // limitations of an array
        // 1. Arrays are fixed in size
        // 2. Arrays can hold only homogeneous data elements
        // 3. ready-made APIs support is not available in array.

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();

        Employee[] employees = new Employee[10];
        employees[0] = new Employee();
        employees[1] = new Employee();

        // Object is the super class- so we can create different objects
        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Employee();

        /*   So why we need collections framework is to avoid limitations of arrays   */

    }
}

class Student{
    String course;
    int mark;
}

class Employee{
    String position;
    int salary;
}
