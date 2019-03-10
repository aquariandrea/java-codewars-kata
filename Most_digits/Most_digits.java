public class MostDigits {
  public static int findLongest(int[] numbers) {
  	int result = numbers[0];

  	for(int i = 1; i < numbers.length; i++){
  		if(String.valueOf(Math.abs(result)).length() < String.valueOf(Math.abs(numbers[i])).length()){
  			result = numbers[i];
  		}
  	}
  	return result;
  }
}