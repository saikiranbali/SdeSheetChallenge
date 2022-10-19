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
