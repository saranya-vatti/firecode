// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean isIntPalindrome(int x) {            
    if(x<0) return false;
    if(x/10 == x) return true;
    List<Integer> dig = new ArrayList<>();
    int y=x;
    while(x>0) {
        dig.add(x%10);
        x=x/10;
    }
    for(int i=0;i<dig.size();i++) {
        if(dig.get(i) != dig.get(dig.size()-i-1)) return false;
    }
    return true;
    
}