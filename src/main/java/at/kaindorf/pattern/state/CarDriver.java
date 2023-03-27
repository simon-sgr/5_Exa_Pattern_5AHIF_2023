package at.kaindorf.pattern.state;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 20. März 2023<br>
 * <b>Time:</b> 12:13<br>
 */

public class CarDriver {
    public static void main(String[] args) {
        Car car = new Car();
        car.turnKey();
        car.pressStopButton();
        car.pressStopButton();
        car.turnKey();
        car.turnKey();
        car.pressStopButton();
    }
}
