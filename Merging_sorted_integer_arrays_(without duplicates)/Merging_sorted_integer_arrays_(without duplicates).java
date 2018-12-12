import java.util.TreeSet;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
		for(int i = 0; i < first.length; i++){
			myTreeSet.add(first[i]);
		}
		for(int i = 0; i < second.length; i++){
			myTreeSet.add(second[i]);
		}
		Integer[] myIntegerSet = myTreeSet.toArray(new Integer[myTreeSet.size()]);
		int[] myIntSet = new int[myIntegerSet.length];
		for(int i = 0; i < myIntegerSet.length; i++){
			myIntSet[i] = myIntegerSet[i];
		}
		return myIntSet;
	}
}