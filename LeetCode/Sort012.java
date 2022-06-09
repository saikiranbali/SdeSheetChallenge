package LeetCode;
// https://leetcode.com/problems/sort-colors/submissions/

class Sort012 {
    public void sortColors(int[] nums) {
        int count_0=0;
        int count_1=0;
        int count_2=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
               count_0++;
           else
               if(nums[i]==1)
               count_1++;
            else
               if(nums[i]==2)
               count_2++;
       }
        int newArr[]=new int[nums.length];
        
        for(int i=0;i<count_0;i++)
            if(count_0>0){
        {
            newArr[i]=0;
        }}
        if(count_1>0){
        for(int i=count_0;i<(count_0+count_1);i++)
        {
            newArr[i]=1;
        }
        }
        
        if(count_2>0){
         for(int i=(count_0+count_1);i<(count_0+count_1+count_2);i++)
        {
            newArr[i]=2;
        }
        }
        for(int i=0;i<newArr.length;i++)
        {
            nums[i]=newArr[i];
        }
 
    }
}
