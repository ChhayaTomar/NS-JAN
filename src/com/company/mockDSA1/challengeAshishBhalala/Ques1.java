package com.company.mockDSA1.challengeAshishBhalala;

//Leetcode ques 81 :- https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/

public class Ques1 {
    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums, int target){
        int low=0;
        int high=nums.length-1;

        while (low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target) return true;
            if(nums[low]<nums[mid]){
                if(target<nums[mid] && target>=nums[low]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[low]>nums[mid]){
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else{
                low=low+1;
            }
        }
        return false;
    }
}
