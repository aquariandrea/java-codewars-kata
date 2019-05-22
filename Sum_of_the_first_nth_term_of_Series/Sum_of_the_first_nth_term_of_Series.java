import java.text.DecimalFormat;

public class NthSeries {
	
	public static String seriesSum(int n) {
		if(n == 0) return "0.00";
		double sum = 1.00;
		double decimal = 4.00;
		for(int i = 2; i <= n; i++){
			sum = sum + (1/decimal);
			decimal = decimal + 3;
		}
		sum = (double) Math.round(sum * 100d) / 100d;
		DecimalFormat df = new DecimalFormat("0.00");
		return String.valueOf(df.format(sum));
	}
}