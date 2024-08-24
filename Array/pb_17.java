//Arrange given numbers to form the biggest number | Set 1
package Array;

import java.util.Arrays;
import java.util.Comparator;

public class pb_17 {
    public static String biggestNo(String arr[]){
        Comparator<String> myCompare=(x,y)->(x+y).compareTo(y+x);

        Arrays.sort(arr,myCompare.reversed());
        if(arr[0].equals("0"))
        {
            return "0";
        }

        StringBuilder result=new StringBuilder();
        for(String num:arr)
        {
            result.append(num);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] arr1 = { "3", "30", "34", "5", "9" };
        System.out.println(biggestNo(arr1));
    }
}
