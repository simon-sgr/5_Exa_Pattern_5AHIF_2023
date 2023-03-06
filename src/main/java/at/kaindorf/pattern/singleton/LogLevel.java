package at.kaindorf;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Logger<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 27. Februar 2023<br>
 * <b>Time:</b> 11:47<br>
 */

public enum LogLevel {
    //INFO, WARNING, ERROR

    INFO(1), WARNING(2), ERROR(3);
    private final int level;
    LogLevel(int i) {
        this.level = i;
    }

    public int getLevel() {
        return level;
    }
}
