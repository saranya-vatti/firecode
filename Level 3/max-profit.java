/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int maxProfit(int[] a) {
        if(a == null || a.length <= 1) return 0;
        int i = 1;
        int profit = 0;
        boolean buying = true;
        int bought = -1;
        while(true)  {
            if(buying) {
                while(i<a.length && a[i-1] >= a[i]) i++;
                if(i == a.length) return profit;
                bought = a[i-1];
                System.out.println("bought = " + bought);
                buying  = false;
            } else {
                while(i<a.length && a[i-1] <= a[i]) i++;
                if(i == a.length) {
                    System.out.println("sold1 = " + a[i-1]);
                    return profit + a[i-1] - bought;
                }
                profit += a[i-1] - bought;
                System.out.println("sold3 = " + a[i-1]);
                buying = true;
            }
            i++;
        }
    }
	public static void main(String[] args) {
	    int[] a = {50,100,50,100,50};
        System.out.println(maxProfit(a));
	}
}
