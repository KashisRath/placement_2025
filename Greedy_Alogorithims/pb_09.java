//190 fractional knapsack
package Greedy_Alogorithims;

import java.util.Arrays;

public class pb_09 {

    static class Item {
        int weight, value;
        double ratio;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 60, 10 }, { 100, 20 }, { 120, 30 } };
        int W = 50;
        facKnap(arr, W);
    }

    public static void facKnap(int[][] arr, int w) {
        Item[] items = new Item[arr.length];

        // Initialize items array with Item objects
        for (int i = 0; i < arr.length; i++) {
            items[i] = new Item(arr[i][1], arr[i][0]); // Note: arr[i][1] is value, arr[i][0] is weight
        }

        // Sort items array based on ratio (descending order)
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        int totalValue = 0;

        // Iterate through sorted items and fill knapsack
        for (Item item : items) {
            if (w == 0)
                break;

            if (item.weight <= w) {
                totalValue += item.value;
                w -= item.weight;
            } else {
                totalValue += item.ratio * w;
                w = 0;
            }
        }

        System.out.println("Maximum value in Knapsack = " + totalValue);
    }
}
