package at.kaindorf;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Logger<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 27. Februar 2023<br>
 * <b>Time:</b> 11:46<br>
 */

public class Logger {
    private static Logger instance;
    private LogLevel logLevel = LogLevel.INFO;

    private Logger() {
    }

    public synchronized static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.ordinal() <= this.logLevel.ordinal()) {
            System.out.println(logLevel + ": " + message);
        }
    }
}
