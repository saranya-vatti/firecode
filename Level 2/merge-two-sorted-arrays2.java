// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
    if(arrLeft == null || arrLeft.length == 0) return arrRight;
    if(arrRight == null || arrRight.length == 0) return arrLeft;
    int left = 0, right = 0;
    int[] arr = new int[arrLeft.length + arrRight.length];
    int i=0;
    while(left<arrLeft.length || right<arrRight.length) {
        if(left<arrLeft.length && right<arrRight.length) {
            if(arrLeft[left]<=arrRight[right]) {
                arr[i++]=arrLeft[left++];
            } else {
                arr[i++]=arrRight[right++];
            }
        } else if(left<arrLeft.length) {
            arr[i++]=arrLeft[left++];
        } else {
            arr[i++]=arrRight[right++];
        }
    }
    return arr;
}
