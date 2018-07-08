// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int maxGain(int[] a) {
    if(a.length <= 1) return 0;
    int max = 0;
    for(int i=0;i<a.length-1;i++) {
        for(int j=i+1;j<a.length;j++) {
            if(a[j]>a[i] && max<a[j]-a[i]) max = a[j]-a[i];
        }
    }
    return max;
}