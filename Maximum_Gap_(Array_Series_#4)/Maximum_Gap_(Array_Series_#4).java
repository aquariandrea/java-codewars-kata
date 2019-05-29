import java.util.Arrays;

public class Solution{
    public static int maxGap(int[] numbers){
    	Arrays.sort(numbers);
    	int maxGap = 0;
    	for (int i = 0; i < numbers.length-1; i++){
    		int step = Math.abs(numbers[i]-numbers[i+1]);
    		if(maxGap < step) maxGap = step;
    	}
        return maxGap;
    }
}