 class Solution {
 	public int searchInsert(int[] nums, int target) {
 		int low = 0, high = nums.length - 1;
 		return bs(nums, low, high, target);
 	}
 	private int bs(int[] nums, int low, int high, int target){
 		int mid = low + (high - low) / 2;
 		if(target > nums[nums.length - 1]) return nums.length;
 		if(mid == low || mid == high){
 			if(target > nums[low]) return high;
 			else return low;
 		}
 		if(nums[mid] == target) return mid;
 		else if(nums[mid] > target) return bs(nums, low, mid, target);
 		else return bs(nums, mid, high, target);
 	}
 }