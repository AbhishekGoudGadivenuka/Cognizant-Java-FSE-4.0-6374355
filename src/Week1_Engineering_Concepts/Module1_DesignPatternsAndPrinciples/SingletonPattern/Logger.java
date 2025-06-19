package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.SingletonPattern;

// Logger class using Singleton Pattern
public class Logger {

    // Step 1: Create a static instance of Logger (eager initialization)
    private static Logger instance = new Logger();

    // Step 2: Private constructor to prevent object creation from outside
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Public method to return the single instance
    public static Logger getInstance() {
        return instance;
    }

    // Step 4: Method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

