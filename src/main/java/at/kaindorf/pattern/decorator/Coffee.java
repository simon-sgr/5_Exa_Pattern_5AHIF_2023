package at.kaindorf.pattern.decorator;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 11:54<br>
 */

public abstract class Coffee {
    public abstract String getDescription();
    public abstract double getCosts();

    @Override
    public String toString() {
        return String.format("%s costs %.2f", getDescription(), getCosts());
    }
}