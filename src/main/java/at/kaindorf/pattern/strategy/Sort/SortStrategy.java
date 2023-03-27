package at.kaindorf.pattern.strategy.Sort;

import java.util.List;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:17<br>
 */

public interface SortStrategy {
    void sort(List<Student> students);
    int getAmountOfSwaps();
}
