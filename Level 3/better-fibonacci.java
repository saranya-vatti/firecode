// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int betterFibonacci(int n) {
    if(n<=0) return 0;
    if(n==1) return 1;
    int fib1 = 0, fib2 = 1;
    for(int i=2;i<=n;i++) {
        int tmp = fib1;
        fib1=fib2;
        fib2 = tmp+fib2;
    }
    return fib2;
}