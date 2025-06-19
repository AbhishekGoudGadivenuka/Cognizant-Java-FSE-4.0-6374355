package Week1_Engineering_Concepts.Module2_DataStructuresAndAlgorithms.FinancialForecastExample;
/*
Recursion : Recursion is a method where a function calls itself to solve a problem by breaking it into smaller subproblems.
Advantages of Recursion:
    - Simplifies code for problems that have repeating subproblems.
    - Natural fit for mathematical sequences and forecasting problems.

Method to calculate future value using recursive approach :
Using compound interest formula : Future Value = Present Value × (1 + r)^n
Recursive function calls :
    FV(n) = FV(n-1)*(1+growthRate)
    if n=0, FV(0) = initialAmt

Complexity analysis of implemented Recursive approach :
    - Time Complexity = O(N) -> Each year calculation depends on the previous year, forming a chain of n recursive calls.
    - Space Complexity = O(N) -> Auxiliary stack space

Optimization of this recursive approach :
The below recursive approach can be optimized using Memoization
Time complexity : O(N)

Finally:
-->Recursive Version:
Time: O(n) where n is the number of years
Space: O(n) due to function call stack
-->Iterative Version:
Time: O(n) where n is the number of years
Space: O(1) — no recursion overhead
 */
import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;  // Base case
        }
        return forecastRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Iterative method to calculate future value
    public static double forecastIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100.0;  // Convert to decimal

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate future value
        double resultRecursive = forecastRecursive(currentValue, growthRate, years);
        double resultIterative = forecastIterative(currentValue, growthRate, years);

        // Print results
        System.out.println("\n--- Forecast Results ---");
        System.out.println("Future Value (Recursive): " + resultRecursive);
        System.out.println("Future Value (Iterative): " + resultIterative);
    }
}
