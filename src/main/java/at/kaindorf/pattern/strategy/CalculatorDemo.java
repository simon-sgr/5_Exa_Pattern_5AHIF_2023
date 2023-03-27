package at.kaindorf.pattern.strategy;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 11:54<br>
 */

public class CalculatorDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationMinus());
        System.out.println(context.executeStrategy(1, 2));

        context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 2));
    }
}
