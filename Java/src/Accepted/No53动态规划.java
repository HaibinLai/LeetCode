package Accepted;

public class No53动态规划 {
    public int maxSubArray(int[] nums) {
        int Max =nums[0];
        int LocalMax =nums[0];
        for(int i=1;i<nums.length;i++){
            LocalMax =Math.max(LocalMax+nums[i],nums[i]);
            Max =Math.max(Max,LocalMax);
        }
        return Max;

    }
}
