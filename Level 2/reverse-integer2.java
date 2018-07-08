// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int reverseInt(int x) {
    int y;
    if(x%10 == x) {
        y = x;
    } else {
        boolean isNeg = false;
        if(x<0) {
            isNeg = true;
            x = -x;
        }
        y = 0;
        while(x>0) {
            y = (y*10) + (x%10);
            x=x/10;
        }
        if(isNeg) y=-y;
    }
    return y;
}