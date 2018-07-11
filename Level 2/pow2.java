/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static double pow(double x, int n) {
        double ans = 1;
        if(n==0) return 1;
        if(n<0) {
            for(int i=n;i<0;i++) {
                ans = ans/x;
            }
        } else {
            for(int i=n;i>0;i--) {
                ans = ans*x;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
        System.out.println(pow(2,5));
	}
}
