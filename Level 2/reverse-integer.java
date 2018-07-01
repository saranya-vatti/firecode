// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int reverseInt(int x) {
    List<Integer> dig = new ArrayList<>();
    int y=x;
    if(x<0) x = -x;
    while(x>0) {
        dig.add(x%10);
        x=x/10;
    }
    int num=0;
    for(int i=0;i<dig.size();i++) {
        int d = dig.get(i);
        num = num*10 + d;
    }
    return y<0 ? -num : num;
}