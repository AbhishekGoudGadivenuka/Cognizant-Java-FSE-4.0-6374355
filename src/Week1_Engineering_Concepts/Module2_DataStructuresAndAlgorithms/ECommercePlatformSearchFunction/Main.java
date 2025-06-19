package Week1_Engineering_Concepts.Module2_DataStructuresAndAlgorithms.ECommercePlatformSearchFunction;

/*
--------------------------------------------------------------------------------
Step 1: Understand Asymptotic Notation
--------------------------------------------------------------------------------

What is Big O Notation?
→ Big O Notation is a mathematical notation used to describe the performance
  or complexity of an algorithm as the input size (n) grows.
→ It focuses on the **worst-case** scenario to help estimate scalability.
→ It ignores machine/environment-specific details and focuses purely on growth.

Why is Big O useful?
→ Helps compare different algorithms based on performance.
→ Helps determine if an algorithm is efficient for large inputs.
→ Essential for choosing the right algorithm in real-world applications
  like search, sort, data processing, etc.

--------------------------------------------------------------------------------
Best, Average, and Worst-Case Scenarios in Search Operations

1. Linear Search (unsorted array):
   - Best Case:    O(1)       → Item is at the first position
   - Average Case: O(n/2) ≈ O(n)
   - Worst Case:   O(n)       → Item is at the last position or not present

2. Binary Search (sorted array):
   - Best Case:    O(1)       → Item is in the middle
   - Average Case: O(log n)
   - Worst Case:   O(log n)

--------------------------------------------------------------------------------
Comparison: Linear Search vs Binary Search

| Feature               | Linear Search   | Binary Search   |
|-----------------------|-----------------|-----------------|
| Requires Sorting?     | No              | Yes             |
| Time Complexity       | O(n)            | O(log n)        |
| Space Complexity      | O(1)            | O(1)            |
| Works on              | Any data        | Sorted data     |
| Use Case              | Small/unsorted  | Large/sorted    |

--------------------------------------------------------------------------------
Which Algorithm is Better?

→ For **small** or **unsorted data**, use **Linear Search** as it's simple.
→ For **large** and **sorted data**, use **Binary Search** due to better time efficiency.

→ In real-world e-commerce platforms with large product catalogs, Binary Search
   is more efficient when combined with sorted or indexed data.

*/

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Footwear"),
                new Product(3, "Smartphone", "Electronics"),
                new Product(4, "T-shirt", "Clothing"),
                new Product(5, "Watch", "Accessories")
        };

        System.out.println("🔍 Linear Search for Smartphone:");
        Product resLS = SearchUtil.linearSearch(products, "Smartphone");
        System.out.println(resLS == null ? "Product not found!" : resLS);

        System.out.println("🔍 Binary Search for Watch:");
        Product resBS = SearchUtil.binarySearch(products, "Watch");
        System.out.println(resBS == null ? "Product not found!" : resBS);
    }
}
