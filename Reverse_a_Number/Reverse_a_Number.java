public class ReverseNumber {
	public static int reverse(int number) {
	boolean sign = number > 0;
	if(sign == false){
		number = Math.abs(number);
	}
	String numberString = "";
	StringBuilder myBuilder = new StringBuilder(String.valueOf(number));
	myBuilder.reverse();
	numberString = myBuilder.toString();
	return sign ? Integer.valueOf(numberString) : (0 - Integer.valueOf(numberString));
	}
}