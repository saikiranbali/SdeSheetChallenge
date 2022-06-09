// https://www.codingninjas.com/codestudio/problems/sort-0-1-2_631055?topList=striver-sde-sheet-problems&leftPanelTab=1

    import java.util.* ;
import java.io.*; 
public class sort012 
{
    public static void sort012(int[] arr)
    {
        int count_0=0;
        int count_1=0;
        int count_2=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==0)
               count_0++;
           else
               if(arr[i]==1)
               count_1++;
            else
               if(arr[i]==2)
               count_2++;
       }
        int newArr[]=new int[arr.length];
        
        for(int i=0;i<count_0;i++)
        {if(count_0>0)
            newArr[i]=0;
        }
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
            arr[i]=newArr[i];
        }
        
      
    }
}
    

