// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String computeBinary(int val) {
    if(val == 0) return "0";
    String str = "";
    while(val!=0) {
        str=Integer.toString(val%2).concat(str);
        val = val/2;
    }
    return str;
}