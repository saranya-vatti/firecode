// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isHappyNumber(int n) {
    HashMap<Integer, Integer> sq = new HashMap<Integer, Integer>();
    Set<Integer> set = new HashSet<Integer>();
    sq.put(1,1);
    sq.put(0,0);
    return isHappy(sq, set, n);
}
private static boolean isHappy(HashMap<Integer, Integer> sq, Set<Integer> set, int n) {
    set.add(n);
    int sum = 0;
    while(n!=0) {
        int dig = n%10;
        if(!sq.containsKey(dig)) {
            sq.put(dig, dig*dig);
        }
        sum+=sq.get(dig);
        n=n/10;
    }
    if(sum==1) return true;
    if(set.contains(sum)) return false;
    return isHappy(sq, set, sum);
}