// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
    int[] arr = new int[arrLeft.length + arrRight.length];
    int left = 0;
    int right = 0;
    int i=0;
    while(i<arrLeft.length+arrRight.length) {
        if(left >= arrLeft.length) {
            arr[i++] = arrRight[right++];
        } else if(right >= arrRight.length) {
            arr[i++] = arrLeft[left++];
        } else if(arrLeft[left]<=arrRight[right]) {
            arr[i++] = arrLeft[left++];
        } else {
            arr[i++] = arrRight[right++];
        }
    }
    return arr;
}