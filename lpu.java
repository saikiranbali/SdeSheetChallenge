// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Problem

// Tom decides to help his friend to schedule meetings for n minutes for a client, can you help Tom with the following

// Find earliest slot from the current time
// Find earliest slot for a given day

// Assumption : initially he is available throughout a day and requires no break between the meetings 

// Sample Input

// n = 30   

// Output : Earliest available slot is 10:30 am to 11:00am IST on 26th August 
 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Calendar;  
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.util.Scanner;
class HelloWorld {

    public static void main(String[] args) {
 Calendar rightNow = Calendar.getInstance();
int currentHour = rightNow.get(Calendar.HOUR_OF_DAY);
int currentMinute =  rightNow.get(Calendar.MINUTE);
int startHour=0;
int startMinute=0;
Scanner sc = new Scanner(System.in); 
System.out.println("Enter Minutes : hours :");
int n=sc.nextInt();
int min=sc.nextInt();
System.out.println("\ncurrent time : "+currentHour+":"+currentMinute);


        boolean[] arr=new boolean[48];
        int t=0;
        for(int i=0;i<(currentHour-startHour)*2;i++)
        {
            arr[i]=true;
            t=i;
        }
        // int min=0;
        System.out.println("\nvalue is "+(t+1)/2);
        // int n=29;
        arr[n*2]=true;
        arr[12]=true;
        if(n%2!=0)
        min=30;
        
        int rang=(currentHour*2);
        if(currentMinute>30)
        rang++;
        for(int i=rang;i<arr.length;i++)
        {
           if(arr[i]==false)
           {
               System.out.println("\nslot available at "+(i/2)+":"+min);
               break;
           }
        }
        
        
      
    }
}
