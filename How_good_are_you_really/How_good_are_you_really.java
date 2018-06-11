public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int average = 0;
    int sum = 0;
    for(int each : classPoints){
      sum += each;
    }
    average = (sum + yourPoints) / (classPoints.length+1);
    return (yourPoints > average);
  }
}
