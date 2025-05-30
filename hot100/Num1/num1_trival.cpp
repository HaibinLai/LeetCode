class Solution {
public:
// from front to back
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> nums1_copy;
        nums1_copy.resize(m);
        for(int i=0; i<m; i++){
            nums1_copy[i] = nums1[i];
        }

        int a_pointer = 0;
        int b_pointer = 0;
        int r_pointer = 0;

        int data = 0;

        while(a_pointer < m && b_pointer < n){
            if(nums1_copy[a_pointer] >= nums2[b_pointer]){
                data = nums2[b_pointer];
                nums1[r_pointer] = data;
                b_pointer++;
                r_pointer++;
            }else{
                data = nums1_copy[a_pointer];
                nums1[r_pointer] = data;
                a_pointer++;
                r_pointer++;
            }
        }

        while(a_pointer < m){
            nums1[r_pointer] = nums1_copy[a_pointer];
            r_pointer++; a_pointer++;
        }

        while(b_pointer < n){
            nums1[r_pointer] = nums2[b_pointer];
            r_pointer++; b_pointer++;
        }

        
    }
};