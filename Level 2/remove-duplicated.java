// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static ArrayList<String> removeDuplicates(List<String> input) {
    Set<String> set = new HashSet<String>();
	ArrayList<String> list = new ArrayList<String>();
    if(input == null) return list;
    for (int i = 0; i < input.size(); i++) {
		set.add(input.get(i));
	}
	list = new ArrayList(set);
	Collections.sort(list);
    return list;
}