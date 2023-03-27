package at.kaindorf.pattern.strategy.Sort;

import java.util.List;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:19<br>
 */

public class OperationSelectionSort implements SortStrategy {

    private int amountSwaps = 0;

    @Override
    public void sort(List<Student> students) {
        amountSwaps = 0;
        for (int i = 0; i < students.size() - 1; i++) {
            Student temp = students.get(i);
            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).compareTo(students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                amountSwaps++;
                students.set(i, students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }

    @Override
    public int getAmountOfSwaps() {
        return amountSwaps;
    }
}
