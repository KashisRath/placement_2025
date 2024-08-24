// : Write a program to find Length of a String using Recursion.
package recurssion;

public class pb_05 {
    public static String lofs(String name,int count){
        if(count==name.length()){
            return Integer.toString(count);
        }
        return lofs(name, count+1);
    }
    public static void main(String[] args) {
        String name="kashis rath";
        System.out.println(lofs(name,0));
    }
}
