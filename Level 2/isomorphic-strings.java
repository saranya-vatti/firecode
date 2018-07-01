// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String str1, String str2) {
    if (str1 == null && str2 == null) return true;
    if (str1 == null || str2 == null) return false;
    if (str1.length() !=  str2.length()) return false;
    HashMap<Character, Integer> h1map = new HashMap<Character, Integer>();
    HashMap<Character, Integer> h2map = new HashMap<Character, Integer>();
    char[] str1Arr = str1.toCharArray();
    char[] str2Arr = str2.toCharArray();
    for(int i=0;i<str1Arr.length;i++) {
        if(!h1map.containsKey(str1Arr[i])) {
            h1map.put(str1Arr[i], 0);
        }
        h1map.put(str1Arr[i], h1map.get(str1Arr[i])+1);
    }
    for(int i=0;i<str2Arr.length;i++) {
        if(!h2map.containsKey(str2Arr[i])) {
            h2map.put(str2Arr[i], 0);
        }
        h2map.put(str2Arr[i], h2map.get(str2Arr[i])+1);
    }
    for(int i=0;i<str1Arr.length;i++) {
        if(h1map.get(str1Arr[i]) != h2map.get(str2Arr[i])) return false;
    }
    return true;
}