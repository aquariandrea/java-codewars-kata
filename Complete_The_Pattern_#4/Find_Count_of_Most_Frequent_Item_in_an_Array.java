import java.util.Arrays;

public class Kata {
  public static int mostFrequentItemCount(int[] collection){
  	int count = 0;
    int[] distinct = Arrays.stream(collection)
                               .distinct()
                               .toArray();
    for(int each1 : distinct){
    	int sum = 0;
    	for(int each2 : collection){
    		if(each1 == each2){
    			sum++;
    		}
    	}
    	if(sum > count){
    		count = sum;
    	}
    }
    return count;
  }
}