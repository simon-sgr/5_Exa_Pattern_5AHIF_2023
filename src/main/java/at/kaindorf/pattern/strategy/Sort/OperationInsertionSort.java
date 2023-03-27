package at.kaindorf.pattern.strategy.Sort;

import java.util.List;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:19<br>
 */

public class OperationInsertionSort implements SortStrategy {

    private int amountSwaps = 0;
    @Override
    public void sort(List<Student> students) {
        amountSwaps = 0;
        for (int i = 1; i < students.size(); i++) {
            Student temp = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).compareTo(temp) > 0) {
                students.set(j + 1, students.get(j));
                j--;
                amountSwaps++;
            }
            students.set(j + 1, temp);
        }
    }

    @Override
    public int getAmountOfSwaps() {
        return amountSwaps;
    }
}
