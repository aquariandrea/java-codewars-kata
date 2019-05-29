import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
    	Arrays.sort(numbers);
      int loopCount = 1;
      if(numbers[0] >= k) return loopCount = 0;
    	int sumSmallest = (numbers[0]+numbers[1]);
    	if(sumSmallest >= k){
    		return loopCount = 1;
    	}else{
    		for(int i = 2; i < numbers.length; i++){
    			loopCount = loopCount +1;
    			sumSmallest = sumSmallest + numbers[i];
    			if(sumSmallest >=k) break;
    		}
    	}
    	return loopCount;
    }
}