// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int getMaxRepetition(int[] a) {
    int max = -1;
    for(int i=0;i<a.length;i++) {
        if(max<a[i]) max = a[i];
    }
    int k = max + 1;
    for(int i=0;i<a.length;i++) {
        a[a[i]%k] += k;
        // System.out.println(Arrays.toString(a));
    }
    max = -1;
    int maxIndex = -1;
    for(int i=0;i<a.length;i++) {
        if(max<a[i]) {
            max = a[i];
            maxIndex = i;
        }
    }
    return maxIndex;
}