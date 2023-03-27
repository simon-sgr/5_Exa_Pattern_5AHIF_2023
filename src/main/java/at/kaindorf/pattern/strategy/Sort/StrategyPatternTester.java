package at.kaindorf.pattern.strategy.Sort;

import java.time.LocalDate;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:16<br>
 */

public class StrategyPatternTester {
    public static void main(String[] args) {
        StudentAdmin studentAdmin = new StudentAdmin();
        Student student = new Student("Simon", "Schoeggler", 181, LocalDate.now());
        Student student2 = new Student("David", "Brannan", 180, LocalDate.now());
        Student student3 = new Student("Michael", "Maier", 178, LocalDate.now());
        Student student4 = new Student("Marcel", "Schmidl", 187, LocalDate.now());
        Student student5 = new Student("Max", "Ertl", 173, LocalDate.now());
        studentAdmin.addStudent(student);
        studentAdmin.addStudent(student2);
        studentAdmin.addStudent(student3);
        studentAdmin.addStudent(student4);
        studentAdmin.addStudent(student5);

        studentAdmin.shuffleStudents();
        studentAdmin.sortStudents();
        System.out.println(studentAdmin.getAmountOfSwaps());
        System.out.println(studentAdmin.getStudents());

        studentAdmin.shuffleStudents();
        studentAdmin.setSortStrategy(new OperationInsertionSort());
        studentAdmin.sortStudents();
        System.out.println(studentAdmin.getAmountOfSwaps());
        System.out.println(studentAdmin.getStudents());

        studentAdmin.shuffleStudents();
        studentAdmin.setSortStrategy(new OperationSelectionSort());
        studentAdmin.sortStudents();
        System.out.println(studentAdmin.getAmountOfSwaps());
        System.out.println(studentAdmin.getStudents());
    }
}
