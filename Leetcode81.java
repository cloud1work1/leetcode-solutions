//81. Search in Rotated Sorted Array II
public class Leetcode81 {
  public boolean search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[start]<nums[mid]){
                if(target < nums[start] || target > nums[mid]){
                    start++;
                } else {
                    end--;
                }
            } else if(nums[start]>nums[mid]){
                if(target<nums[mid] || target>nums[end]){
                    end--;
                } else {
                    start++;
                }
            } else {
                start++;
            }
        }
        return false;
    }
    }
}
