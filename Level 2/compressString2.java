// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String compressString(String text) {
    String str = "";
    int len = text.length();
    if(text == null || len <= 1) return text;
    for(int i=0;i<len;) {
        char c = text.charAt(i++);
        str = str.concat(Character.toString(c));
        int count = 1;
        while(i<len && text.charAt(i) == c) {
            i++;
            count++;
        }
        if(count > 1) str = str.concat(Integer.toString(count));
    }
    return str;
}