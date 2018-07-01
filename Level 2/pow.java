// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static double pow(double x, int n) {
    double ans = 1;
    if(n>=0) {
        for(int i=0;i<n;i++) {
            ans = ans * x;
        }
    } else {
        for(int i=n;i<0;i++) {
            ans = ans / x;
        }
    }
    return ans;
}