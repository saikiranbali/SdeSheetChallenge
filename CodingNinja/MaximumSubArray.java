package CodingNinja;
// https://www.codingninjas.com/codestudio/problems/maximum-subarray-sum_630526?topList=striver-sde-sheet-problems&leftPanelTab=1

import java.util.* ;
import java.io.*; 

public class MaximumSubArray {
	
	public static long maxSubarraySum(int[] arr, int n) {
        long sum=Long.MIN_VALUE;
        long curSum = 0;
        if(arr.length<1)
            return 0;
        if(arr.length==1 && arr[0]==0)
            return 0;
        for(int i=0;i<arr.length;i++)
        {
            curSum = curSum+ arr[i];
            if(curSum>sum)
                sum=curSum;
            
            if(curSum<0)
                curSum=0;
          
        }
        if(sum<0)
            return 0;
        return sum;
	}

}

