package at.kaindorf.pattern.decorator;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 12:03<br>
 */

public class WhipCreamDecorator extends MilkDecorator {
    public WhipCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with WhipCream";
    }

    @Override
    public double getCosts() {
        return coffee.getCosts() + 1.0;
    }
}
