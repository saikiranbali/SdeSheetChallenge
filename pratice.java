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

// recursively print from backtracking 8 - 7 - 6 - 5 - 4- 3- 2 -1

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