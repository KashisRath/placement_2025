// While playing an RPG game, you were assigned to complete one of the hardest quests in this game.There are n monsters you'll need to defeat in this quest. Each monster i is described with two integer 
// numbers - poweri and bonusi. To defeat this monster, you'll need at least poweri experience points. If 
// you try fighting this monster without having enough experience points, you lose immediately. You will 
// also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.The quest turned out to be very hard - you try to defeat the monsters but keep losing repeatedly. Your 
// riend told you that this quest is impossible to complete. Knowing that, you're interested, what is the 
// maximum possible number of monsters you can defeat? (Question difficulty level: Hardest)nput:The first line contains an integer, n, denoting the number of monsters.The next line contains an integer, e, denoting your initial experience.Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents 
// power of the corresponding monster.Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents 
// bonus for defeating the corresponding monster.Sample cases:Input Output Output description2123781301002 Initial experience level is 123 points.Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133.Defeat the second monster.310010110030410015242 Initial experience level is 100 points.Defeat the second monster having power of 100 and bonus of 1. 
// Experience level is now 100+1=101.Defeat the first monster having power of 101 and bonus of 100. Experience level is now 101+100=201.The third monster can't be defeated.Unique Birthday GiftYour birthday is coming soon and one of your friends, Alex, is thinking about a gift for you. He knows 
// hat you really like integer arrays with interesting properties.

//greedy problem
package INFOSYS;

import java.util.PriorityQueue;
import java.util.Scanner;

public class pb_01 {
    public static int defeatMonsters(int n, int e, int[] power, int[] bonus) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{power[i], bonus[i]});
        }

        int count = 0;
        while (!pq.isEmpty()) {
            int[] monster = pq.poll();
            if (monster[0] <= e) {
                e += monster[1];
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int e = scanner.nextInt();
        int[] power = new int[n];
        int[] bonus = new int[n];

        for (int i = 0; i < n; i++) {
            power[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bonus[i] = scanner.nextInt();
        }

        System.out.println(defeatMonsters(n, e, power, bonus));
    }
}
