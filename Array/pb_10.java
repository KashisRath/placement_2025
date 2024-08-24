//rainWater trap
package Array;

public class pb_10 {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int leftBound[]=new int[height.length];
        int rightBound[]=new int[height.length];
        leftBound[0]=height[0];
        rightBound[height.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++)
        {
            leftBound[i]=Math.max(height[i],leftBound[i-1]);
        }

        for(int i=height.length-2;i>=0;i--)
        {
            rightBound[i]=Math.max(height[i],rightBound[i+1]);
        }

        int trappedWater=0;
        int boundry;
        for(int i=0;i<height.length;i++)
        {
            boundry=Math.min(leftBound[i], rightBound[i]);
            trappedWater+=boundry-height[i];
        }
        System.out.println(trappedWater);
    }
}
