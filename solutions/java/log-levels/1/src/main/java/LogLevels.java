public class LogLevels {
    
    public static String message(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        String[] logMessage = logLine.split(":");
        return logMessage[1].trim();
    }

    public static String logLevel(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        // inside .split(); [] is used to define multiple delimiters and tell split that if either of it appears the split it like split("[:\\[\\]]") but when we use it outside [] like split("\\[\\]"); then it will search for pattern like [] and if available then only will split it
        String[] logLevelArray = logLine.split("[\\[\\]]");
        return logLevelArray[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        String[] reformatArray = logLine.split("[\\[\\]:]");
        return reformatArray[3].trim() + " (" + logLevel(logLine) + ")";
    }
}
