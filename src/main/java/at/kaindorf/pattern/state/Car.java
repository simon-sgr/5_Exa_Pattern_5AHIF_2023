package at.kaindorf.pattern.state;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 20. März 2023<br>
 * <b>Time:</b> 12:04<br>
 */

public class Car {
    private State currentState;

    public Car() {
        this.currentState = new Parked();
    }

    public void turnKey () {
        currentState.start(this);
    }

    public void pressStopButton () {
        currentState.stop(this);
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
