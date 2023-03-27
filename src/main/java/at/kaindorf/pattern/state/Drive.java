package at.kaindorf.pattern.state;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 20. März 2023<br>
 * <b>Time:</b> 12:03<br>
 */

public class Drive implements State {
    @Override
    public void start(Car car) {
        System.out.println("Car already started");
    }

    @Override
    public void stop(Car car) {
        System.out.println("Stopping the car");
        car.setCurrentState(new Parked());
    }
}
