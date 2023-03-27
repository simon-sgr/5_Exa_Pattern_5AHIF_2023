package at.kaindorf.pattern.state.coffee;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 20. März 2023<br>
 * <b>Time:</b> 12:33<br>
 */

public class InProcess implements CoffeeState{

    @Override
    public void insertCoins(CoffeeMaker coffeeMaker) {
        System.out.println("not possible during coffee making");
    }

    @Override
    public void chooseCoffee(CoffeeMaker coffeeMaker, int costs) {
        System.out.println("already making coffee");
    }

    @Override
    public void removeCoins(CoffeeMaker coffeeMaker) {
        System.out.println("not possible during coffee making");
    }

    @Override
    public void addCaffeine(CoffeeMaker coffeeMaker) {
        System.out.println("not possible during coffee making");
    }

    @Override
    public void finishCoffee(CoffeeMaker coffeeMaker) {
        if (coffeeMaker.getCaffeineAmount() < 100) {
            coffeeMaker.setCurrentState(new NoCoffee());
        } else {
            coffeeMaker.setCurrentState(new Ready());
        }
    }

    @Override
    public String toString() {
        return "InProcess";
    }
}
