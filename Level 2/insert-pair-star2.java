// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String insertPairStar(String s) {
    if(s==null || s.equals("")) return s;
    String str = Character.toString(s.charAt(0));
    for(int i=1;i<s.length();i++) {
        if(str.charAt(str.length() - 1) == s.charAt(i)) {
            str = str.concat("*");
        }
        str = str.concat(Character.toString(s.charAt(i)));
    }
    return str;
}