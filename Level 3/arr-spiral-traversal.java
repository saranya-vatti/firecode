/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static ArrayList<Integer> findSpiral(int[][] arr) {
	    ArrayList<Integer> alist = new ArrayList<Integer>();
	    if(arr == null || arr.length == 0) return alist;
	    int minRowDone = -1;
	    int minColDone = -1;
	    int maxRowDone = arr.length;
	    int maxColDone = arr[0].length;
	    char direction = 'E';
	    int row = 0; int col = arr[0].length-1;
	    int prevLen = 0;
	    while(true) {
	        if(direction == 'E') {
	            if(minColDone == maxColDone) return alist;
	            for(int j=minColDone+1;j<maxColDone;j++) {
	                alist.add(arr[row][j]);
	            }
	            col = maxColDone - 1;
	            minRowDone++;
	            direction = 'S';
	        } else if(direction == 'S') {
	            if(minRowDone == maxRowDone) return alist;
	            for(int i=minRowDone+1;i<maxRowDone;i++) {
	                alist.add(arr[i][col]);
	            }
		row = maxRowDone - 1;
		maxColDone--;
		direction = 'W';
	        } else if(direction == 'W') {
	            if(minColDone == maxColDone) return alist;
	            for(int j=maxColDone-1;j>minColDone;j--) {
	                alist.add(arr[row][j]);
	            }
	            col = minColDone + 1;
	            maxRowDone--;
	            direction = 'N';
	        } else {
	            if(minRowDone == maxRowDone) return alist;
	            for(int i=maxRowDone-1;i>minRowDone;i--) {
	                alist.add(arr[i][col]);
	            }
	            row = minRowDone + 1;
	            minColDone++;
	            direction = 'E';
	        }
	        /*System.out.println(Arrays.toString(alist.toArray()));
	        System.out.println("minRowDone = " + minRowDone);
	        System.out.println("maxColDone = " + maxColDone);
	        System.out.println("maxRowDone = " + maxRowDone);
	        System.out.println("minColDone = " + minColDone);*/
	        if(alist.size() == prevLen) return alist;
	        prevLen = alist.size();
	    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] arr = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
		System.out.println(Arrays.toString(findSpiral(arr).toArray()));
	}
}
