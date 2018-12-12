import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {
	public static int[] flattenAndSort(int[][] array){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				myList.add(array[i][j]);
			}
		}
		myList.stream().distinct();
		int[] myInt = new int[myList.size()];
		for(int i = 0; i < myList.size(); i++){
			myInt[i] = Integer.valueOf(myList.get(i));
		}
		Arrays.sort(myInt);
		return myInt;
	}
}