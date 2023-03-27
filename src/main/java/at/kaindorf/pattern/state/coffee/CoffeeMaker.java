package at.kaindorf.pattern.state.coffee;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 20. März 2023<br>
 * <b>Time:</b> 12:30<br>
 */

public class CoffeeMaker {
    private CoffeeState currentState = new Ready();

    private int coinAmount;
    private int caffeineAmount;

    void addCoin() {
        coinAmount+=50;
    }

    public void insertCoins () {
        currentState.insertCoins(this);
    }

    public void removeCoins () {
        currentState.removeCoins(this);
    }

    public void chooseCoffee (int costs) {
        currentState.chooseCoffee(this, costs);
    }

    public void addCaffeine () {
        currentState.addCaffeine(this);
    }

    public void finishCoffee () {
        currentState.finishCoffee(this);
    }

    void addCaffeineAmount() {
        caffeineAmount+=100;
    }

    void removeCoin() {
        coinAmount-=50;
    }

    void removeCaffeine(int costs) {
        caffeineAmount-=costs;
    }

    public int getCaffeineAmount() {
        return caffeineAmount;
    }

    public int getCoinAmount() {
        return coinAmount;
    }

    public void setCurrentState(CoffeeState currentState) {
        this.currentState = currentState;
    }

    public CoffeeState getCurrentState() {
        return currentState;
    }

}
