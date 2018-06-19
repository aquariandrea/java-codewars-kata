import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.Collections;

public class Solution{
  public static int maxTriSum (int[] numbers){
    List<Integer> myList = new ArrayList<Integer>();

    for(int each : numbers){
      myList.add(each);
    }

    Set<Integer> mySet = new LinkedHashSet<Integer>(myList);

    myList.clear();
    myList.addAll(mySet);
    Collections.sort(myList);
    return myList.get(myList.size()-1) + myList.get(myList.size()-2) + myList.get(myList.size()-3);
  }
}
