package at.kaindorf.pattern.strategy.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:16<br>
 */

public class StudentAdmin {
    private SortStrategy sortStrategy = new OperationBubbleSort();
    private List<Student> students = new ArrayList<>();

    private int amountOfSwaps = 0;

    private Scanner scanner = new Scanner(System.in);


    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudentByConsole() {
        System.out.println("Enter the name of the student:");
        String name = scanner.nextLine();
        System.out.println("Enter the height of the student:");
        int height = scanner.nextInt();

    }

    public List<Student> getStudents() {
        return students;
    }

    public void shuffleStudents() {
        Collections.shuffle(students);
    }

    public void sortStudents() {
        sortStrategy.sort(students);
    }

    public int getAmountOfSwaps () {
        return sortStrategy.getAmountOfSwaps();
    }
}
