// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int maxGain(int[] arr) {
    if(arr.length<=1) return 0;
    int max = 0;
    int start = 0;
    while(start != arr.length-1) {
        int maxIndex = start;
        for(int i=start+1;i<arr.length;i++) {
            if(arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
        }
        if(arr[maxIndex] - arr[start] > max) { 
            max = arr[maxIndex] - arr[start];
        }
        start++;
    }
    return max;
}