// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String computeBinary(int val) {
    if(val == 0) return "0";
    String ans = new String();
    while(val!=0) {
        ans = Integer.toString(val%2) + ans;
        val=val/2;
    }
    while(ans.charAt(0) == '0') {
        ans = ans.substring(1);
    }
    return ans;
}