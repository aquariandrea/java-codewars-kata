public class GrassHopper {

  public static int findAverage(int[] nums) {
    int sum  = 0;
    for(int each : nums){
      sum += each;
    }
    return sum/nums.length;
  }
}
