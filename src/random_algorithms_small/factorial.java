public class factorial {
    long factorial_recursive(long n){
        if(n == 0) return 1;
        else return n * factorial_recursive(n - 1);
    }

    long fib(long n){
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
