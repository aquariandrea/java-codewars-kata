public class Printer {    
    public static String printerError(String s) {
    	int denominator = s.length();
    	int numerator = 0;
    	for (int i = 0; i < s.length(); i++){
    		if(Integer.valueOf(s.charAt(i)) > 109){
    			numerator ++;
    		}
    	}
    	return numerator + "/" + denominator;
    }
}