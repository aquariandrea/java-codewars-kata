public class School{

 	public static int getAverage(int[] marks){
  int sum = 0;
  for(int each : marks){
    sum += each;
  }
		return sum/marks.length;
	}
}
