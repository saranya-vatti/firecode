// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] coupleSum(int[] numbers, int target) {
    int index1=0, index2=0;
    while(numbers[index1] + numbers[index2] != target) {
        if(index1 == index2) index2++;
        else index1++;
    }
    int[] arr = {index1+1, index2+1};
    return arr;
}