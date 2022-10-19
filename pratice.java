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
            if(n==1 || n==1)
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
