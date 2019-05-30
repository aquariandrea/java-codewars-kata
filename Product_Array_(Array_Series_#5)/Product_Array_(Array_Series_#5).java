public class Solution{
    public static long[] productArray(int[] numbers){
    	long[] myIntArray = new long[numbers.length];
    	for(int i = 0; i < numbers.length; i++){
    		long sum = 1l;
    		for(int each : numbers){
    			sum = sum * each;
    		}
    		myIntArray[i] = sum / numbers[i];
    	}
        return myIntArray;
    }
}