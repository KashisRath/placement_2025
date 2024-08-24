//chocola problem
package Greedy_Alogorithims;

import java.util.Arrays;
import java.util.Collections;

public class pb_15 {
    public static void main(String[] args) {
        Integer horizontalCost[] = {2,  3};
        Integer verticalCost[] = {1, 2};

        Arrays.sort(horizontalCost, Collections.reverseOrder());
        Arrays.sort(verticalCost, Collections.reverseOrder());

        int v = 0, h = 0;
        int vp = 1, hp = 1;

        int cost = 0;
        while (h < horizontalCost.length && v < verticalCost.length) {
            if (horizontalCost[h] >= verticalCost[v]) {
                cost += horizontalCost[h] * vp;
                hp++;
                h++;
            } else {          
                cost += verticalCost[v] * hp;
                vp++;
                v++;            
            }
        }

        // Handle remaining vertical cuts
        while (v < verticalCost.length) {
            cost += verticalCost[v] * hp;
            v++;
        }

        // Handle remaining horizontal cuts
        while (h < horizontalCost.length) {
            cost += horizontalCost[h] * vp;
            h++;
        }

        System.out.println(cost);
    }
}
