package TimeLimitExceed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int l =nums.length;
        List<List<Integer>> S =new ArrayList<>();
        for(int i=0;i<l-2;i++){
            for(int j=i+1;j<l-1;j++){
                int Kij =-9000;
                for (int k=j+1;k<l;k++){
                    if(nums[k]==Kij){continue;}
                    if(nums[i]+nums[j]+nums[k]==0){
                        Kij=nums[k];
                        List<Integer> p =new ArrayList<>();
                        int[] s=new int[3];
                        s[0]=nums[i];
                        s[1]=nums[j];
                        s[2]=nums[k];
                       Arrays.sort(s);

                        p.add(s[0]);p.add(s[1]);p.add(s[2]);
                        if(!S.contains(p)){ S.add(p);}
                    }
                }
            }
        }
        return S;

    }

    /*RightAnswer:
    *  int n=  nums.length ;
    Arrays.sort(nums);

    Set<List<Integer>> ans = new HashSet<>();
    for(int i= 0 ;i<n-2 ;i++){
            // Using Two pointers method with sorted entries
            int tar = -1*nums[i];
            int s = i+1 , e = n-1;
            while(s<e){
                int val = nums[s]+nums[e];
                if(val == tar){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]) ; res.add(nums[s]) ; res.add(nums[e]);
                    ans.add(res);
                    s++;e--;
                }else if(val > tar) e--;
                 else s++;
            }
       }
    return new ArrayList<>(ans);
    * */
}
