package Accepted;

public class No35 {
    //class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=nums.length;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=target){s=i;break;}
        }
        return s;
    }

}
