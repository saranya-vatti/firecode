// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] coupleSum(int[] numbers, int target) {
    int left = 0;
    int right = 0;
    while(numbers[left]+numbers[right] != target) {
        if(left == right) right++;
        else left++;
    }
    int[] ans = {left+1, right+1};
    return ans;
}