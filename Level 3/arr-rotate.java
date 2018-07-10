import java.util.*;
public class Main
{
    public static int[] rotateLeft(int[] arr, int k) {
        if(arr == null || arr.length <= 1 || k == 0) return arr;
        int len = arr.length;
        k = k%len;
        while(k-->0) {
            int tmp = arr[0];
            for(int i=len-1;i>=0;i--) {
                int tmp2 = arr[i];
                arr[i] = tmp;
                tmp = tmp2;
            }
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(rotateLeft(arr,10)));
    }
}
