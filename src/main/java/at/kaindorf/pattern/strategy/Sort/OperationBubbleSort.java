package at.kaindorf.pattern.strategy.Sort;

import java.util.List;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:18<br>
 */

public class OperationBubbleSort implements SortStrategy {

    private int amountSwaps = 0;
    @Override
    public void sort(List<Student> students) {
        amountSwaps = 0;
        boolean swapped = false;
        int n = students.size();

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (students.get(i).compareTo(students.get(i + 1)) > 0) {
                    Student temp = students.get(i);
                    students.set(i, students.get(i + 1));
                    students.set(i + 1, temp);

                    amountSwaps++;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    @Override
    public int getAmountOfSwaps() {
        return amountSwaps;
    }
}
