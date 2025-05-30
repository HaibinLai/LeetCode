class Solution {
public:
// from back to front
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        int a_pointer = m-1;
        int b_pointer = n-1;
        int r_pointer = m+n-1;

        int data = 0;

        while(a_pointer >= 0 && b_pointer >= 0){
            if(nums1[a_pointer] <= nums2[b_pointer]){
                nums1[r_pointer] = nums2[b_pointer];
                b_pointer--; r_pointer--;
            }
            else{
                nums1[r_pointer] = nums1[a_pointer];
                r_pointer--; a_pointer--;
            }
        }

        while(a_pointer >= 0){
            nums1[r_pointer] = nums1[a_pointer];
            r_pointer--; a_pointer--;
        }
        while(b_pointer >= 0){
            nums1[r_pointer] = nums2[b_pointer];
            r_pointer--; b_pointer--; 
        }
        
    }
};