import java.util.*;
public class Main
{
    public static boolean isPowOfTwo(int num) {
        if(num==0) return false;
        while(num>1) {
            if(num%2 != 0) return false;
            num = num/2;
        }
        return true;
    }
        public static void main(String[] args) {
        System.out.println(isPowOfTwo(8));
    }
}
