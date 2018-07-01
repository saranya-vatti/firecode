// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static int betterFibonacci(int n) {
    if(n==0) return 0;
    if(n==1 || n==2) return 1;
    int[] fib = new int[n+1];
    for(int i=0;i<=n;i++) {
        fib[i] = -1;
    }
    fib[0] = 0;
    fib[1] = 1;
    fib[2] = 1;
    return getFib(fib, n);
}
private static int getFib(int[] fib, int n) {
    if(fib[n] != -1) return fib[n];
    fib[n] = getFib(fib, n-1) + getFib(fib, n-2);
    return fib[n];
}