public class Kata {
  public static int dutyFree(int normPrice, int discount, int hol) {
  	double savedPrice = (normPrice * discount) / 100.00;
  	double resultDouble = hol / savedPrice;
  	int resultInt = (int) resultDouble;
  	return resultInt;
  }
}