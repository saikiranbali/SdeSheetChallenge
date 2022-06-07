package LeetCode;
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            curSum = curSum+ nums[i];
            if(curSum>sum)
                sum=curSum;
            
            if(curSum<0)
                curSum=0;
          
            
        }
        return sum;
        
    }
}

