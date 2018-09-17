public class Kata {
  public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
  	int fridayCount = 0;
  	int saturdayCount = 0;
  	for (int i = 0; i < fridayNightCounting.length; i++){
  		fridayCount = fridayCount + fridayNightCounting[i];
  	}
  	for (int i = 0; i < saturdayNightCounting.length; i++){
  		saturdayCount = saturdayCount + saturdayNightCounting[i];
  	}
    return sheepsTotal - fridayCount - saturdayCount;
  }
}