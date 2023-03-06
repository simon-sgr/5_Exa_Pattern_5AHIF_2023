package at.kaindorf;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Logger<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 27. Februar 2023<br>
 * <b>Time:</b> 11:48<br>
 */

public class LogTester {
    public static void main(String[] args) {
        Logger.getInstance().setLogLevel(LogLevel.WARNING);

        Logger.getInstance().log(LogLevel.INFO, "This is an info message");
        Logger.getInstance().log(LogLevel.WARNING, "This is a warning message");
        Logger.getInstance().log(LogLevel.ERROR, "This is an error message");
    }
}
