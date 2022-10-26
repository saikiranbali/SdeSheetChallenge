// sum of n natural numbers using recursion

class HelloWorld {
    public static int sum(int n)
        {
            if(n==1)
            return 1;
            return sum(n-1)+n;
        }
    public static void main(String[] args) {
      
        System.out.println(sum(10));
    }
}

// factorial using recursion

class HelloWorld {
    public static int sum(int n)
        {
            if(n==0 || n==1)
            return 1;
            return n*sum(n-1);
        }
    public static void main(String[] args) {
      
        System.out.println(sum(3));
    }
}

// recursive program to return the nth fibonocci number

class HelloWorld {
    public static int fib(int n)
        {
            if(n==0)
            return 0;
            if(n==1)
            return 1;
            return fib(n-1)+fib(n-2);
        }
    public static void main(String[] args) {
      
        System.out.println(fib(8));
    }
}

//sum of digits using recursion

public class Solution {
    public int solve(int A) {
        if(A==0)
        return 0;
        return (A%10)+solve(A/10);
    }
}

// recursively print from  8 - 7 - 6 - 5 - 4- 3- 2 -1

class HelloWorld {
    public static int seri(int n)
        {

            if(n==1)
            return 1;
            System.out.println(n);
            return seri(n-1);
        }
    public static void main(String[] args) {
      
        System.out.println(seri(8));
    }
}

// recursively print using backtracking 1 2 3 4 5 6 7 8 9 10

class HelloWorld {
    public static void seri(int n)
        {

            if(n==0)
            return ;
            
             seri(n-1);
            System.out.println(n);
        }
    public static void main(String[] args) {
      
        seri(10);
    }
}

// recursively check if a string is a palindrome or not

class HelloWorld {
    public static int isPalindrome(String str,int s,int e)
    {
        if(s>e)
        return 1;
        if(str.charAt(s)==str.charAt(e))
        return isPalindrome(str,s+1,e-1);
        else
        return 0;
    }
    public static int seri(String s)
        {
            return isPalindrome(s,0,s.length()-1);
        }
    public static void main(String[] args) {
       System.out.println(seri("namani"));
    }
}
