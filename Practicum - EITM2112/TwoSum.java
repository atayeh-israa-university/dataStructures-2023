package com.ds;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Solution solution = new Solution();
		    int[] nums = {3,2,4};
		    int target = 6;
		    int[] result = solution.twoSum(nums, target);
		    System.out.print(result[0]+ ","+ result[1]);
		  
	}
}



	class Solution {
	    public  int[] twoSum(int[] nums, int target) {
	       int n = nums.length;
	        
	        // Check all possible pairs
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[]{i, j};
	                }
	            }
	        }
	        
	        // If no solution is found, return an empty array
	        return new int[]{};
	}
	}


