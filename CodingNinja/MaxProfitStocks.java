package CodingNinja;
// https://www.codingninjas.com/codestudio/problems/stocks-are-profitable_893405?topList=striver-sde-sheet-problems&leftPanelTab=1
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class MaxProfitStocks{
    public static int maximumProfit(ArrayList<Integer> prices){
         int max=Integer.MIN_VALUE;
        int sum=0;
        int ans=0;
        for(int i=prices.size()-1;i>=0;i--)
        {
            if(prices.get(i)>max)
            {
                max=prices.get(i);
                
            }
            sum=max-prices.get(i);
            if(sum>ans)
                ans=sum;
            
            
        }
        return ans;
        
    }
}