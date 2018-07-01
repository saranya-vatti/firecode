// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String compressString(String text) {
    if(text == null) return text;
    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
    for(int i=0;i<text.length();i++) {
        if(!hmap.containsKey(text.charAt(i))) {
            hmap.put(text.charAt(i), 0);
        }
        hmap.put(text.charAt(i), hmap.get(text.charAt(i))+1);
    }
    String str = new String();
    for(int c=0;c<26;c++) {
        char ch = (char)('a'+c);
        if(hmap.containsKey(ch)) {
            int val = hmap.get(ch);
            str = str.concat(Character.toString(ch));
            if(val>1) str = str.concat(Integer.toString(val));
        }
    }
    return str;
}