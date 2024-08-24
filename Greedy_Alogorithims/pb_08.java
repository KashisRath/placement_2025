//189 Greedy Algorithm for Egyptian Fraction
package Greedy_Alogorithims;

public class pb_08 {
    public static void main(String[] args) {
        int nr = 6, dr = 14;
        EgyptianFraction(nr, dr);
    }

    public static void EgyptianFraction(int nr, int dr) {
        if (nr == 0 || dr == 0) {
            return;
        }
        if (nr % dr == 0) {
            System.out.print(nr % dr + " ");
            return;
        }
        if (dr % nr == 0) {
            System.out.print("1/" + dr / nr);
            return;
        }

        if (nr > dr) {
            System.out.print(nr/dr+" ");
            EgyptianFraction(nr%dr, dr);
            return;
        }

        int n=dr/nr +1;

        System.out.println("1/"+n);
        EgyptianFraction(nr*n-dr, dr*n);
    }
}
