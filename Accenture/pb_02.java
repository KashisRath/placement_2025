import java.util.Scanner;

public class pb_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int power[]=new int[n];
        for(int i=0;i<n;i++)
        {
            power[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;

        int firstKing=0;
        int secondKing=0;

        boolean kingalter=true;

        while(left<=right){
            if(Math.abs(power[left])>Math.abs(power[right])){
                if(kingalter)
                {
                    firstKing+=power[left];
                }
                else{
                    secondKing+=power[left];                
                }
                left++;
            }
            else{
                if(kingalter)
                {
                    firstKing+=power[right];
                }
                else{
                    secondKing+=power[right];                
                }
                right--;
            }
            kingalter=!kingalter;
        }

        System.out.println(Math.abs(firstKing-secondKing)); 
    }
}
