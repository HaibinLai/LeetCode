package Accepted;

import java.util.Arrays;

public class No88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] F=new int[m+n];
        for(int i=0;i<m;i++){
            F[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            F[m+i]=nums2[i];
        }
        Arrays.sort(F);
        for(int i=0;i<m+n;i++){
            nums1[i]=F[i];
        }

    }

    public static void main(String[] args) {
        double j =10034543.066;
        System.out.printf("55,%.2f",j);
    }
}
