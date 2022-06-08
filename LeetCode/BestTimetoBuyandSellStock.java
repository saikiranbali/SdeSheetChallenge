// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
package LeetCode;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int ans=0;
        for(int i=prices.length-1;i>=0;i--)
        {
            if(prices[i]>max)
            {
                max=prices[i];
                
            }
            sum=max-prices[i];
            if(sum>ans)
                ans=sum;
            
            
        }
        return ans;
        
    }
    
}
