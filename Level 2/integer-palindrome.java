/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static Boolean isIntPalindrome(int x) {  
        if(x<0) return false;                     
        if(x%10 == x) return true;
        int y = 0;
        int backup = x;
        while(x>0) {
            y = y*10 + (x%10);
            x=x/10;
        }
        System.out.println(y);
        return backup==y;
    }
	public static void main(String[] args) {
		System.out.println(isIntPalindrome(0));
	}
}
