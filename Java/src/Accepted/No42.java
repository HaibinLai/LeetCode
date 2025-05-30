package Accepted;

public class No42 {
    public int trap(int[] height) {

        int l =height.length;
        int[] maxLeft =new int[l];
        int[] maxRight =new int[l];
        int Water =0;
        maxLeft[0] =height[0];
        for(int i=1;i<l;i++){
            maxLeft[i]=Math.max(height[i],maxLeft[i-1]);
        }
        maxRight[l-1]=height[l-1];
        for (int i=l-2;i>=0;i--){
            maxRight[i]=Math.max(height[i],maxRight[i+1]);
        }
        int pool=0;
        for (int i=0;i<l;i++){
            int waterLevel =Math.min(maxRight[i],maxLeft[i]);
            pool += waterLevel-height[i];
        }
        return pool;
    }
}
