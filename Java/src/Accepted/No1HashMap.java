package Accepted;

import java.util.HashMap;
import java.util.Map;

public class No1HashMap {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int i1=0;
        int i2=0;
        for(int i=0;i<l-1;i++){
            i1 =nums[i];
            for(int j=i+1;j<l;j++){
                i2=nums[j];
                if(i1+i2==target){
                    int[] ans=new int[2];
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }

            }
        }
        return null;
    }
    public int[] twoSum2(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
