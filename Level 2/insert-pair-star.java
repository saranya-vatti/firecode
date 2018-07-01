// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String insertPairStar(String str) {
    if(str == null || str.length() <= 1) return str;
    String str2 = Character.toString(str.charAt(0));
    for(int i=1;i<str.length();i++) {
        if(str2.charAt(str2.length()-1) == str.charAt(i)) {
            str2 = str2.concat(Character.toString('*'));
        }
        str2 = str2.concat(Character.toString(str.charAt(i)));
    }
    return str2;
}