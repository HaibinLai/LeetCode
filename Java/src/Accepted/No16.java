package Accepted;

public class No16 {
    public int threeSumClosest(int[] nums, int target) {
        int l=nums.length;
        int Closest=10000000;
        int Small =0;
        for(int i=0;i<l-2;i++){
            for (int j=i+1;j<l-1;j++){
                for(int k=j+1;k<l;k++){
                    int Sum =nums[i]+nums[j]+nums[k];
                    if(Math.abs(Sum-target)<=Closest){
                        Small=Sum;
                        Closest=Math.abs(Sum-target);}

                }
            }
        }

        return Small;
    }
}
