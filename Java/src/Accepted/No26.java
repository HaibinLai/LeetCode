package Accepted;

import java.util.ArrayList;

public class No26 {
    public int removeDuplicates(int[] nums) {
        int length =nums.length;
        int k=0;
        ArrayList arr =new ArrayList<>();
        int p=0;
        for (int num : nums) {
            if (!arr.contains(num)) {
                arr.add(num);
                nums[p]=num;
                p+=1;
            }
        }
        k=arr.size();

        return k;

    }
}
