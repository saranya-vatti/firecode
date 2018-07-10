// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isAnagram(String input1, String input2) {
    if(input1 == null || input2 == null) return false;
    if(input1.length() != input2.length()) return false;
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for(int i=0;i<input1.length();i++) {
        char c = input1.charAt(i);
        if(!map1.containsKey(c)) {
            map1.put(c, 0);
        }
        map1.put(c, map1.get(c) + 1);
    }
    for(int i=0;i<input1.length();i++) {
        char c = input2.charAt(i);
        if(!map1.containsKey(c)) {
            return false;
        }
        if(!map2.containsKey(c)) {
            map2.put(c, 0);
        }
        map2.put(c, map2.get(c) + 1);
    }
    return map1.equals(map2);
}