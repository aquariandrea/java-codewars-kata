public class Kata{
  public static double[] averages(int[] numbers){
    if (numbers == null || numbers.length < 2) return new double[] {};
  		double[] averageArray = new double[numbers.length-1];
  		for(int i = 0; i < numbers.length-1; i++){
  			averageArray[i] = ((double) numbers[i] + (double) numbers[i+1])/2.00;
  		}
    return averageArray;
  }
}