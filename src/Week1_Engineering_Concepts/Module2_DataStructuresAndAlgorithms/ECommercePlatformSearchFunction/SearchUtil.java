package Week1_Engineering_Concepts.Module2_DataStructuresAndAlgorithms.ECommercePlatformSearchFunction;


import java.util.*;

public class SearchUtil {

    // Linear Search: O(n)
    public static Product linearSearch(Product[] products, String productName) {
        for (Product prod : products) {
            if (prod.productName.equalsIgnoreCase(productName)) {
                return prod;
            }
        }
        return null;
    }

    // Binary Search: O(log n)
    public static Product binarySearch(Product[] products, String productName) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(productName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
