import java.util.Collections;
import java.util.*;

public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
	    List<Integer> arr = new ArrayList<Integer>();
	    int bigger = Integer.max(s1, s2);
      int multiple = bigger;
	    while(multiple < s3){
	    	if(((multiple % s2) == 0) && (((multiple % s1) ==0))){
	    		arr.add(multiple);
	    	}
        multiple = multiple + bigger;
	    }
	    Collections.sort(arr);
	    return arr;
    }
}