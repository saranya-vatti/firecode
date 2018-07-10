// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static ArrayList<String> removeDuplicates(List<String> input) {
    TreeSet<String> treeSet = new TreeSet<String>();
    for(int i=0;i<input.size();i++) {
        treeSet.add(input.get(i));
    }
    return new ArrayList(treeSet);
}