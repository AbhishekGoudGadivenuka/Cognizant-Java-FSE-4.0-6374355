package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.SingletonPattern;

// Class to test the Singleton behavior of Logger
public class LoggerTest {
    public static void main(String[] args) {
        // Get the Logger instance (should always return the same object)
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both instances
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both logger1 and logger2 point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Logger instances are different (Singleton failed).");
        }
    }
}

