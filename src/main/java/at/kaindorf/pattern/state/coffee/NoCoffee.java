package at.kaindorf.pattern.state.coffee;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 20. März 2023<br>
 * <b>Time:</b> 12:33<br>
 */

public class NoCoffee implements CoffeeState {
    @Override
    public void insertCoins(CoffeeMaker coffeeMaker) {
        coffeeMaker.addCoin();
    }

    @Override
    public void chooseCoffee(CoffeeMaker coffeeMaker, int costs) {
        System.out.println("first refill caffeine");
    }

    @Override
    public void removeCoins(CoffeeMaker coffeeMaker) {
        coffeeMaker.removeCoin();
    }

    @Override
    public void addCaffeine(CoffeeMaker coffeeMaker) {
        coffeeMaker.addCaffeineAmount();
        coffeeMaker.setCurrentState(new Ready());
    }

    @Override
    public void finishCoffee(CoffeeMaker coffeeMaker) {
        System.out.println("no caffeine");
    }

    @Override
    public String toString() {
        return "NoCoffee";
    }
}
