// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isPowOfTwo(int num) {
    if(num==0) return false;
    if(num==1) return true;
    while(num!=2) {
        if(num%2 != 0) return false;
        num = num/2;
    }
    return true;
}