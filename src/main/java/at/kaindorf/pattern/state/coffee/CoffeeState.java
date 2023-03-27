package at.kaindorf.pattern.state.coffee;
/**
* <h3>Created by IntelliJ IDEA.</h3><br>
* <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
* <b>User:</b> Simon Schoeggler<br>
* <b>Date:</b> 20. März 2023<br>
* <b>Time:</b> 12:28<br>
*/

public interface CoffeeState {

    void insertCoins(CoffeeMaker coffeeMaker);
    void chooseCoffee(CoffeeMaker coffeeMaker, int costs);
    void removeCoins(CoffeeMaker coffeeMaker);
    void addCaffeine(CoffeeMaker coffeeMaker);
    void finishCoffee(CoffeeMaker coffeeMaker);

}
